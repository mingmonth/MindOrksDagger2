package yskim.sample.mindorksdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Math math = new Math();
        Science science = new Science();
        Subject subject = new Subject(math, science);
        subject.read();
    }
}