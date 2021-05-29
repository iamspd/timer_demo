package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                Log.i("InRunnable: ", "A second has passed!");

                handler.postDelayed(this, 1000);
            }
        };

        handler.post(runnable);

    }
}