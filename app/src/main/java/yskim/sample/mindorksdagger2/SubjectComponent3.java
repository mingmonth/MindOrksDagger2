package yskim.sample.mindorksdagger2;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {ScienceModule.class, PureMathModule3.class})
public interface SubjectComponent3 {

    Subject getSubject();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder bookName(String bookName);

        SubjectComponent3 build();
    }
}
