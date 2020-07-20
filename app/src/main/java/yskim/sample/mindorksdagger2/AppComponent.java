package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ScienceModule.class)
public interface AppComponent {

//    SubjectComponent4 getSubjectComponent4(PureMathModule pureMathModule);
//    SubjectComponent4.Builder getSubjectComponent4Builder();
    SubjectComponent4.Factory getSubjectComponent4Factory();
//    Science getScience();

    @Component.Factory
    interface Factory {

        AppComponent create(ScienceModule scienceModule);
    }
}
