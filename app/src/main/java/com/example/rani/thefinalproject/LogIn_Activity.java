package com.example.rani.thefinalproject;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;

public class LogIn_Activity extends AppCompatActivity {

    public static final int RC_SIGN_IN = 1;

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessagesDatabaseReference;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mFirebaseAuth = FirebaseAuth.getInstance();
//        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//                if (user != null) {
//                    //user is signed in
//                    Toast.makeText(LogIn_Activity.this, "Signed in", Toast.LENGTH_SHORT).show();
//                } else {
//                    //user is signed out
//                    startActivityForResult(
//                            AuthUI.getInstance()
//                                    .createSignInIntentBuilder()
//                                    .setIsSmartLockEnabled(false)
//                                    .setAvailableProviders(Arrays.asList(
//                                            new AuthUI.IdpConfig.EmailBuilder().build(),
//                                            new AuthUI.IdpConfig.GoogleBuilder().build()))
//                                    .build(),
//                            RC_SIGN_IN);
//                }
//            }
//        };

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        Button btn1 = (Button) findViewById(R.id.SignOut);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
            }
        });

    }


    @Override
    protected void onPause(){
        super.onPause();
        mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
    }

    @Override
    protected void onResume(){
        super.onResume();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
        //Check
    }
}
