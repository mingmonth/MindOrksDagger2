package yskim.sample.mindorksdagger2;

import android.util.Log;

import javax.inject.Inject;

public class Subject {

    private static final String TAG = "Subject";
    
    private Math math;
    private Science science;

    @Inject
    public Subject(Math math, Science science) {
        this.math = math;
        this.science = science;
    }
    
    public void read() {
        Log.d(TAG, "read: math:" + math);
        Log.d(TAG, "read: science:" + science);
    }
}
