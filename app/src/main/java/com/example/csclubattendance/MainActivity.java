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
                changeActivity(addUser.class);
            }
        });

        btn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changeActivity(signIn.class);
            }
        });

    }

    public void changeActivity(Class activity){
        Intent change = new Intent(this, activity);
        startActivity(change);
    }

}
