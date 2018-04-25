package com.example.rani.thefinalproject;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("main", "MainActivity: in onCreate \n");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        findViewById(R.id.moveToSignInActivity).setOnClickListener(this);
    }

    @Override
    protected void onPause(){
        Log.d("main", "MainActivity: in onPause \n");
        super.onPause();
    }

    @Override
    protected void onResume(){
        Log.d("main", "MainActivity: in onResume \n");
        super.onResume();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.moveToSignInActivity:
                moveToSignInActivity();
                break;
        }
    }

    private void moveToSignInActivity(){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}
