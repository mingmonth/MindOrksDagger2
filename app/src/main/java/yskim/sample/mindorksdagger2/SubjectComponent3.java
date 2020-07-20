package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = PureMathModule3.class)
public interface SubjectComponent3 {

    Subject getSubject();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder bookName(String bookName);

        SubjectComponent3.Builder appComponent(AppComponent component);

        SubjectComponent3 build();
    }
}
