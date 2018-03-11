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

    protected void onResume() {
        super.onResume();
        String tutorialKey = "SOME_KEY";
        Boolean firstTime = getPreferences(MODE_PRIVATE).getBoolean(tutorialKey, true);
        if (firstTime) {
            Toast.makeText(WelcomeActivity.this, "First Run", Toast.LENGTH_LONG).show(); // here you do what you want to do - an activity tutorial in my case
            getPreferences(MODE_PRIVATE).edit().putBoolean(tutorialKey, false).apply();
        }
    }

    public void moveToLoginActivity(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent startActivity = new Intent(WelcomeActivity.this, LogIn_Activity.class);
                startActivity(startActivity);
                finish();
            }

        }, 5000L);
    }
}
