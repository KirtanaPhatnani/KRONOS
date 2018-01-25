package com.example.kirtanaphatnani.kronos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SignUp extends AppCompatActivity {

    public RadioButton AcademicCommitte,HMC,CMC,SBG;
    public Button Done;
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        CMC=(RadioButton) findViewById(R.id.CMC);
        HMC=(RadioButton) findViewById(R.id.HMC);
        AcademicCommitte=(RadioButton) findViewById(R.id.AC);
        SBG=(RadioButton) findViewById(R.id.SBG);
        final StringBuilder sb = new StringBuilder();
        CMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(CMC.getText());
                sb.append(" ");
            }
        });
        HMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(HMC.getText());
                sb.append(" ");
            }
        });
        SBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(SBG.getText());
                sb.append(" ");

            }
        });
        AcademicCommitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(AcademicCommitte.getText());
                sb.append(" ");

            }
        });
        String selected = sb.toString();
        Done =(Button) findViewById(R.id.btn_done);
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUp.this,HomeScreen.class);
                startActivity(i);
            }
        });

    }

}


