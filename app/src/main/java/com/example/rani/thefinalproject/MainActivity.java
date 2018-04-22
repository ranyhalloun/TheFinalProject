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

public class MainActivity extends AppCompatActivity {

    public static final int RC_SIGN_IN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("main", "MainActivity: in onCreate \n");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, LoginActivity.class));

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
}
