package com.example.csclubattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button returnBtn = (Button) findViewById(R.id.btn_rtnFromSignIn);
        Button confirmBtn = (Button) findViewById(R.id.btn_confirmSignin);
        EditText username = (EditText) findViewById(R.id.etxt_name_Signin);
        EditText password = (EditText) findViewById(R.id.etxt_password_Signin);
        //TODO:
        //Check if username and password match from SQLite database
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}