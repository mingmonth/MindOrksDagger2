package yskim.sample.mindorksdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Subject subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //beforeApplyDI();
        //afterApplyDI();
        afterApplyDI2();

    }

    private void afterApplyDI2() {
        DaggerSubjectComponent2.builder()
                .pureMathModule(new PureMathModule("ABC"))
                .build()
                .inject(this);
        subject.read();

    }

    private void afterApplyDI() {
        SubjectComponent component = DaggerSubjectComponent.create();
        component.inject(this);
        subject.read();
    }

    private void beforeApplyDI() {
        //Math math = new Math();
        //Math math = new PureMath();
        Math math = new BusinessMath();
        Science science = new Science();
        Subject subject = new Subject(math, science);
        subject.read();
    }
}