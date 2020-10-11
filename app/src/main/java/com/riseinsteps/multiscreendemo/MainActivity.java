package com.riseinsteps.multiscreendemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.riseinsteps.multiscreendemo.LOGIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void logIn(View view){
        Intent intent = new Intent(this, LoginConfirmation.class);
        EditText user_email = findViewById(R.id.user_email);
        EditText user_password = findViewById(R.id.userPassword);

        if(user_email.getText().toString().equals("") || user_password.getText().toString().equals("")){
            Toast.makeText(this, "Please fill above fields", Toast.LENGTH_SHORT).show();
        } else{
            String LoginDataEmail = user_email.getText().toString();
            intent.putExtra(MSG, LoginDataEmail);
            startActivity(intent);
        }
    }
}