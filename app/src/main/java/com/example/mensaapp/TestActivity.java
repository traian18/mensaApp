package com.example.mensaapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mensaapp.fragments.TestInstructionFragment;


public class TestActivity extends AppCompatActivity implements TestInstructionFragment.TestFragmentStartTest {

    private FragmentTransaction ft;

    private TextView mCounterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mCounterTextView = findViewById(R.id.counterTextView);
        mCounterTextView.setText("hello");

        startTimer();

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainer, new TestInstructionFragment());
        ft.commit();


    }

    private void startTimer() {
        new CountDownTimer(30000, 1000) {
            Integer seconds = 30;

            @Override
            public void onTick(long l) {
                mCounterTextView.setText(seconds.toString());
                seconds = seconds - 1;
            }

            @Override
            public void onFinish() {
                mCounterTextView.setText("to late");
            }
        }.start();
    }


    @Override
    public void startTest() {
        Toast.makeText(getApplicationContext(), "Starting test", Toast.LENGTH_SHORT).show();
    }
}
