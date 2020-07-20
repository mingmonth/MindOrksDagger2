package yskim.sample.mindorksdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Subject subject, subject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //beforeApplyDI();
        //afterApplyDI();
        //afterApplyDI2();
        //afterApplyDI3();
        //afterApplyDI4();
        //afterApplyDI5();
        afterApplyApplicationDI();

    }

    private void afterApplyApplicationDI() {
//        SubjectComponent component = ((MyApplication) getApplication()).getSubjectComponent();
//        component.inject(this);
//        subject.read();
//        SubjectComponent4 component4 = ((MyApplication) getApplication()).getSubjectComponent4();
//        component4.inject(this);
//        subject.read();
//        SubjectComponent4 component = DaggerSubjectComponent4.builder()
//                .bookName("PPP")
//                .bookAuthor("UUU")
//                .appComponent(((MyApplication) getApplication()).getAppComponent())
//                .build();
//        SubjectComponent4 component = ((MyApplication) getApplication()).getAppComponent()
//                .getSubjectComponent4(new PureMathModule("pureMath"));

//        SubjectComponent4 component = ((MyApplication) getApplication()).getAppComponent()
//                .getSubjectComponent4Builder()
//                .bookName("PPP")
//                .bookAuthor("UUU")
//                .build();
        SubjectComponent4 component = ((MyApplication) getApplication()).getAppComponent()
                .getSubjectComponent4Factory().create("PPP", "UUU");

        component.inject(this);
        subject.read();
        subject2.read();

    }

    private void afterApplyDI5() {
//        DaggerSubjectComponent5.factory()
//                .create("AAA", "DDD")
//                .inject(this);
//        subject.read();
//        subject2.read();
    }

    private void afterApplyDI4() {
//        DaggerSubjectComponent4.builder()
//                .bookName("CCC")
//                .bookAuthor("KKK")
//                .build()
//                .inject(this);
//        subject.read();
    }

    private void afterApplyDI3() {
//        DaggerSubjectComponent3.builder()
//                .bookName("ABC")
//                .build()
//                .inject(this);
//        subject.read();
    }

    private void afterApplyDI2() {
//        DaggerSubjectComponent2.builder()
//                .pureMathModule(new PureMathModule("ABC"))
//                .build()
//                .inject(this);
//        subject.read();

    }

    private void afterApplyDI() {
        //SubjectComponent component = DaggerSubjectComponent.create();
//        SubjectComponent component = DaggerSubjectComponent.builder().build();
//        component.inject(this);
//        subject.read();
    }

    private void beforeApplyDI() {
        //Math math = new Math();
        //Math math = new PureMath();
        Math math = new BusinessMath();
        Science science = new Science("TEST");
        Subject subject = new Subject(math, science);
        subject.read();
    }
}