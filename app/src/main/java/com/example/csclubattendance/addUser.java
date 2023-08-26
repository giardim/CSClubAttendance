package com.example.csclubattendance;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        Button returnBtn = (Button) findViewById(R.id.btn_rtnFromAdduser);
        Button confirmBtn = (Button) findViewById(R.id.btn_confirmAddUser);
        EditText fullName = (EditText) findViewById(R.id.etxt_name);
        EditText password = (EditText) findViewById(R.id.etxt_password);
        EditText confirmPassword = (EditText) findViewById(R.id.etxt_confirmPassword);
        EditText email = (EditText) findViewById(R.id.etxt_email);

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (password.getText().toString().equals(confirmPassword.getText().toString())){
                    //TODO:
                    //1. Add logic to save username, password and email to sqlite database
                    //The server will later be changed to a postgres database
                    //2. Learn how to securely hash passwords into the database (SHA256?)
                    Toast.makeText(addUser.this, "passwords match", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(addUser.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}