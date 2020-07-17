package yskim.sample.mindorksdagger2;

import android.util.Log;

import javax.inject.Inject;

public class BusinessMath implements Math {

    private static final String TAG = "Subject - BusinessMath";

    @Inject
    public BusinessMath() {
    }

    @Override
    public void mathBook() {
        Log.d(TAG, "mathBook: ");
    }
}
