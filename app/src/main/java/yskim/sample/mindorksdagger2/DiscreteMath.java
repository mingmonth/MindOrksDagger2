package yskim.sample.mindorksdagger2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class DiscreteMath implements Math {

    private static final String TAG = "Subject - DiscreteMath";

    private String bookName;
    private String bookAuthor;

    @Inject
    public DiscreteMath(@Named("book name") String bookName, @Named("book author") String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public void mathBook() {
        Log.d(TAG, "mathBook: " +
                "\nBookName: " + bookName +
                "\nBookAuthor: " + bookAuthor);
    }
}
