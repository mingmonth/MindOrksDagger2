package yskim.sample.mindorksdagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = DiscreteMathModule.class)
public interface SubjectComponent4 {

    Subject getSubject();

    void inject(MainActivity activity);

//    @Subcomponent.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder bookName(@Named("book name") String bookName);
//
//        @BindsInstance
//        Builder bookAuthor(@Named("book author") String bookAuthor);
//
//        SubjectComponent4 build();
//    }

    @Subcomponent.Factory
    interface Factory {
        SubjectComponent4 create(@BindsInstance @Named("book name") String bookName,
                                 @BindsInstance @Named("book author") String bookAuthor);
    }
}
