package yskim.sample.mindorksdagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {ScienceModule.class, DiscreteMathModule.class})
public interface SubjectComponent5 {

    Subject getSubject();

    void inject(MainActivity activity);

    @Component.Factory
    interface Factory{
        SubjectComponent5 create(@BindsInstance @Named("book name") String bookName,
                                 @BindsInstance @Named("book author") String bookAuthor);
    }
}
