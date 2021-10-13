package com.outven.bmtchallange.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.outven.bmtchallange.R;
import com.outven.bmtchallange.helper.HidenBar;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        HidenBar hidenBar = new HidenBar();
        Window window = getWindow();
        hidenBar.WindowFlag(this, window);

        final ImageView imageView = (ImageView) findViewById(R.id.imgLogo);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent m = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    finish();
                    overridePendingTransition(R.anim.from_right, R.anim.to_left);
                    startActivityForResult(m,0);
                }
            }
        };
        timer.start();
    }
}