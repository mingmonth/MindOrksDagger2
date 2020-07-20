package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = BusinessMathModule.class)
public interface SubjectComponent {

    Subject getSubject();

    void inject(MainActivity activity);
}
