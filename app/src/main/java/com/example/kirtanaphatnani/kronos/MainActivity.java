package com.example.kirtanaphatnani.kronos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button login, signUp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.bt1_Login);
        signUp = (Button) findViewById(R.id.bt1_signUp);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
            }
//        signUp.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View k) {
//                    Intent j = new Intent(MainActivity.this,SignUp.class);
//                    startActivity(j);
//                }
        });
        signUp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, SignUp.class);
                startActivity(j);
            }
//        signUp.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View k) {
//                    Intent j = new Intent(MainActivity.this,SignUp.class);
//                    startActivity(j);
//                }
        }  );
    }
}
