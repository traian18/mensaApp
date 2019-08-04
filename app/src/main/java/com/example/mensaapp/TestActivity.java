package com.example.mensaapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mensaapp.testmodule.Test;


//TODO: 1 - Create Test Timer (In Progress)
//TODO: 2 - Create question with answers module; (Done)
//TODO: 3 - Create Test Runner module (In Progress)

public class TestActivity extends AppCompatActivity {

    private Handler mHandler;
    private Runnable mRunnable;
    private int mTimerButtonValue;
    private Test currentTest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void countDownTimerStart(){
        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                mHandler.postDelayed(this, 1000);

            }
        };
    }
}
