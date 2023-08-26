package com.example.csclubattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_addUser = (Button) findViewById(R.id.btn_addUser);
        Button btn_signIn = (Button) findViewById(R.id.btn_signIn);

        btn_addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity_addUser();
            }
        });

        btn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changeActivity_signIn();
            }
        });

    }

    public void changeActivity_addUser(){
        Intent change = new Intent(this, addUser.class);
        startActivity(change);
    }

    public void changeActivity_signIn(){
        Intent change = new Intent(this, signIn.class);
        startActivity(change);
    }

    public void changeActivity_main(){
        Intent change = new Intent(this, MainActivity.class);
        startActivity(change);
    }
}
