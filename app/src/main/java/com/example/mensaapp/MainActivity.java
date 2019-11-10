package com.example.mensaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mAboutMensa;
    private Button mWhatIsIq;

    private Button mMensaPrinciples;
    private Button mTakeFreeTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMensaPrinciples = findViewById(R.id.mensaPrinciplesButton);
        mWhatIsIq = findViewById(R.id.WhatIsIQButton);
        mAboutMensa = findViewById(R.id.AboutMensaButton);
        mTakeFreeTest = findViewById(R.id.TakeFreeTestButton);


        mMensaPrinciples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MensaPrinciples.class);
                startActivity(intent);
            }
        });

        mWhatIsIq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WhatIsIqActivity.class);
                startActivity(intent);
            }
        });

        mAboutMensa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutMensaRomania.class);
                startActivity(intent);

            }
        });


        mTakeFreeTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TestActivity.class);
                startActivity(intent);
            }
        });

    }
}
