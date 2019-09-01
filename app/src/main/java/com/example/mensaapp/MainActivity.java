package com.example.mensaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mAboutMensaRomania;
    private Button mWhatIsIq;
    private Button mAboutIqTest;
    private Button mAboutMensaInternational;
    private Button mTakeFreeTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAboutMensaInternational = findViewById(R.id.AboutMensaInternationalButton);
        mWhatIsIq = findViewById(R.id.WhatIsIQButton);
        mAboutIqTest = findViewById(R.id.AboutIQTestButton);
        mAboutMensaRomania = findViewById(R.id.AboutMensaRomaniaButton);
        mTakeFreeTest = findViewById(R.id.TakeFreeTestButton);


        mAboutMensaInternational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutMensaInternational.class);
                startActivity(intent);
            }
        });

        mWhatIsIq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mAboutMensaRomania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutMensaRomania.class);
                startActivity(intent);

            }
        });

        mAboutIqTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mTakeFreeTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
