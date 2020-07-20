package yskim.sample.mindorksdagger2;

import android.app.Application;

public class MyApplication extends Application {

    //SubjectComponent subjectComponent;
    SubjectComponent4 subjectComponent4;

    @Override
    public void onCreate() {
        super.onCreate();
        subjectComponent4 = DaggerSubjectComponent4.builder()
                .bookName("LLL")
                .bookAuthor("OOO")
                .build();
    }

    SubjectComponent4 getSubjectComponent4() {
        return subjectComponent4;
    }
}
