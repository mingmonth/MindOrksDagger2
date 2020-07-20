package yskim.sample.mindorksdagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = DiscreteMathModule.class)
public interface SubjectComponent4 {

    Subject getSubject();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder bookName(@Named("book name") String bookName);

        @BindsInstance
        Builder bookAuthor(@Named("book author") String bookAuthor);

        Builder appComponent(AppComponent component);

        SubjectComponent4 build();
    }
}
