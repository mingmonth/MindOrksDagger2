package yskim.sample.mindorksdagger2;

import android.util.Log;

import javax.inject.Inject;

public class PureMath implements Math {

    private static final String TAG = "Subject - PureMath";
    
    private String bookName;

    //@Inject
    // here, must removed @Inject as the value is passed at the runtime
    @Inject
    public PureMath(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void mathBook() {
        Log.d(TAG, "mathBook: " + bookName);
    }
}
