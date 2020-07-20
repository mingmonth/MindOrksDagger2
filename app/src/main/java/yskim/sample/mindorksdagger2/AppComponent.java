package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ScienceModule.class)
public interface AppComponent {

    SubjectComponent4 getSubjectComponent4(PureMathModule pureMathModule);
//    Science getScience();
}
