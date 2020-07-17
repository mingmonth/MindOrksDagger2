package yskim.sample.mindorksdagger2;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class PureMathModule {

    private static final String TAG = "Subject";
    
    private String bookName;

    public PureMathModule(String bookName) {
        this.bookName = bookName;
    }

    @Provides
    String provideBookName() {
        return bookName;
    }

    @Provides
    Math provideMath(PureMath pureMath) {
        //return new PureMath(bookName);
        return pureMath;
    }

    // then PureMath Constructor has not @Inject.
//    @Provides
//    Math provideMath() {
//        return new PureMath(bookName);
//    }
}
