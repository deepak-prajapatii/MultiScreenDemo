package com.riseinsteps.multiscreendemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class LoginConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_confirmation);

        Intent intent = getIntent();
        String userEmail = intent.getStringExtra(MainActivity.MSG);
        EditText userConfirmation = findViewById(R.id.user_confirmation);
        userConfirmation.setText("Congratulations, your email " + userEmail + " successfully verified with our community.");
    }
}