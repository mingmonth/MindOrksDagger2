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
        //afterApplyDI2();
        //afterApplyDI3();
        //afterApplyDI4();
        afterApplyDI5();

    }

    private void afterApplyDI5() {
        DaggerSubjectComponent5.factory()
                .create("AAA", "DDD")
                .inject(this);
        subject.read();
    }

    private void afterApplyDI4() {
        DaggerSubjectComponent4.builder()
                .bookName("CCC")
                .bookAuthor("KKK")
                .build()
                .inject(this);
        subject.read();
    }

    private void afterApplyDI3() {
        DaggerSubjectComponent3.builder()
                .bookName("ABC")
                .build()
                .inject(this);
        subject.read();
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