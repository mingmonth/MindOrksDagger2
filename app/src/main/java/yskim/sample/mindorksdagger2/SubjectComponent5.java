package yskim.sample.mindorksdagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = {DiscreteMathModule.class})
public interface SubjectComponent5 {

    Subject getSubject();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        SubjectComponent5.Builder bookName(@Named("book name") String bookName);

        @BindsInstance
        SubjectComponent5.Builder bookAuthor(@Named("book author") String bookAuthor);

        SubjectComponent5.Builder appComponent(AppComponent component);

        SubjectComponent5 build();
    }

//    @Component.Factory
//    interface Factory{
//        SubjectComponent5 create(@BindsInstance @Named("book name") String bookName,
//                                 @BindsInstance @Named("book author") String bookAuthor);
//    }
}
