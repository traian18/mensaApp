package com.example.mensaapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mensaapp.fragments.QuestionFragment;
import com.example.mensaapp.fragments.SampleQuestionFragment;
import com.example.mensaapp.fragments.TestInstructionFragment;


public class TestActivity extends AppCompatActivity implements TestInstructionFragment.InstructionCallbackInterface,
        SampleQuestionFragment.SampleQuestionCallbackInterface {

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
        new CountDownTimer(600_000, 1000) {
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
    public void startSampleQuestion() {
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainer, new SampleQuestionFragment());
        ft.commit();
    }

    @Override
    public void startTest() {
        Toast.makeText(getApplicationContext(), "StartTestPressed", Toast.LENGTH_SHORT).show();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainer, new QuestionFragment());
        ft.commit();
    }
}
