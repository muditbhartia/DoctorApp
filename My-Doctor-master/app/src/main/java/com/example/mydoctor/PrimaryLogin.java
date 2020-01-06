package com.example.mydoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class PrimaryLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_login);


        Button docb = findViewById(R.id.doc_btn);
        Button patb = findViewById(R.id.pat_btn);

        docb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DoctorSignInActivity.class);
                startActivity(intent);
                finish();
            }
        });

        patb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PatientSignInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}