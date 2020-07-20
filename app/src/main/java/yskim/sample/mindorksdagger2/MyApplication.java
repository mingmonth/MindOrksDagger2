package yskim.sample.mindorksdagger2;

import android.app.Application;

public class MyApplication extends Application {

    SubjectComponent subjectComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        subjectComponent = DaggerSubjectComponent.builder().build();
    }

    SubjectComponent getSubjectComponent() {
        return subjectComponent;
    }
}
