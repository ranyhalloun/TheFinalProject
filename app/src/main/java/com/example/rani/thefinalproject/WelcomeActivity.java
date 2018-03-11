package com.example.rani.thefinalproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        moveToLoginActivity();
    }

    public void moveToLoginActivity(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                String tutorialKey = "SOME_KEY";
                Boolean firstTime = getPreferences(MODE_PRIVATE).getBoolean(tutorialKey, true);
                if (firstTime) {
                    getPreferences(MODE_PRIVATE).edit().putBoolean(tutorialKey, false).apply();
                    Intent startActivity = new Intent(WelcomeActivity.this, FirstTimeActivity.class);
                    startActivity(startActivity);
                    finish();
                }
                else{
                    Intent startActivity = new Intent(WelcomeActivity.this, LogIn_Activity.class);
                    startActivity(startActivity);
                    finish();
                }

            }

        }, 5000L);
    }


}
