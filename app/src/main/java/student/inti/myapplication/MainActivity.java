package student.inti.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Handler handler1;
    Runnable runnable1;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
            img1.animate().alpha(4000).setDuration(0);

            handler1 = new Handler();
            handler1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent dsp = new Intent(MainActivity.this,LogInActivity.class);
                    startActivity(dsp);
                    finish();
                }
            },4000);
    }
}
