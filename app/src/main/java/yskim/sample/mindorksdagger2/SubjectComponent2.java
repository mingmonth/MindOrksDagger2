package yskim.sample.mindorksdagger2;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Provides;

@Component(modules = {ScienceModule.class, PureMathModule.class})
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
