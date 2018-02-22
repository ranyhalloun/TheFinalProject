package com.example.rani.thefinalproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moveToLoginActivity();
    }

    public void moveToLoginActivity(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent startActivity = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(startActivity);
                finish();
            }

        }, 1500L);
    }

}
