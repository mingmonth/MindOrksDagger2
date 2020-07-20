package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Provides;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = PureMathModule.class)
public interface SubjectComponent2 {

    Subject getSubject();

    void inject(MainActivity activity);

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder bookName(String bookName);
//
//        SubjectComponent2 build();
//    }
}
