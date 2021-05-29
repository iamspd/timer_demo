package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

                Log.i("onTick: ", "Seconds remaining: "
                        + millisUntilFinished / 1000);

            }

            @Override
            public void onFinish() {

                Log.i("onTick: ", "Countdown Timer finished!");

            }
        }.start();

        /*Handler handler = new Handler();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                Log.i("InRunnable: ", "A second has passed!");

                handler.postDelayed(this, 1000);
            }
        };

        handler.post(runnable);*/

    }
}