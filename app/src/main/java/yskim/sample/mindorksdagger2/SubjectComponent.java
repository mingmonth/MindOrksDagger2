package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ScienceModule.class, BusinessMathModule.class})
public interface SubjectComponent {

    Subject getSubject();

    void inject(MainActivity activity);
}
