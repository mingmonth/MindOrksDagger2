package yskim.sample.mindorksdagger2;

import android.app.Application;

public class MyApplication extends Application {

    //SubjectComponent subjectComponent;
//    SubjectComponent4 component;
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
//        component = DaggerSubjectComponent4.builder()
//                .bookName("LLL")
//                .bookAuthor("OOO")
//                .build();
//        component = DaggerAppComponent.create();
        component = DaggerAppComponent.factory().create(new ScienceModule("TEST"));
    }

//    SubjectComponent4 getSubjectComponent4() {
//        return component;
//    }
    public AppComponent getAppComponent() {
        return component;
    }
}
