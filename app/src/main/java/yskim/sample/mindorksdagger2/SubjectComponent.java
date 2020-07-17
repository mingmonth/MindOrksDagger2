package yskim.sample.mindorksdagger2;

import dagger.Component;

@Component(modules = ScienceModule.class)
public interface SubjectComponent {

    Subject getSubject();

    void inject(MainActivity activity);
}