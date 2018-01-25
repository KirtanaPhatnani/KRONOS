package com.example.kirtanaphatnani.kronos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.kirtanaphatnani.kronos.R.id.btn_submit;


public class LoginActivity extends AppCompatActivity {
    public View Email;
    public EditText Password;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Email = findViewById(R.id.input_Email);
        Password = (EditText) findViewById(R.id.input_password);

        Submit=(Button) findViewById(btn_submit);
        Submit.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i = new Intent(LoginActivity.this,HomeScreen.class);
                                         startActivity(i);
                                     }
        });
    }
}

