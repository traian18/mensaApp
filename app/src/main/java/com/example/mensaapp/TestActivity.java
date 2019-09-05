package com.example.mensaapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mensaapp.fragments.QuestionFragment;
import com.example.mensaapp.fragments.ResultFragment;
import com.example.mensaapp.fragments.SampleQuestionFragment;
import com.example.mensaapp.fragments.TestInstructionFragment;


public class TestActivity extends AppCompatActivity implements TestInstructionFragment.InstructionCallbackInterface,
        SampleQuestionFragment.SampleQuestionCallbackInterface, QuestionFragment.QuestionCallBackInterface,
        ResultFragment.ResultFragmentCallbackInterface {

    private FragmentTransaction ft;
    private TextView mCounterTextView;
    private Integer numberOfCorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mCounterTextView = findViewById(R.id.counterTextView);

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainer, new TestInstructionFragment());
        ft.commit();


    }

    private void startTimer() {
        new CountDownTimer(600_000, 1000) {
            Integer seconds = 600;

            @Override
            public void onTick(long l) {
                timeFormater(seconds);
                seconds = seconds - 1;
            }

            @Override
            public void onFinish() {
                mCounterTextView.setText("to late");
            }
        }.start();
    }

    private void timeFormater(Integer seconds) {
        Integer receivedSeconds = seconds;
        Integer minutes = seconds / 60;
        receivedSeconds = seconds % 60;
        String stringSeconds = receivedSeconds.toString();
        String stringMinutes = minutes.toString();
        if (receivedSeconds < 10) {
            stringSeconds = "0" + receivedSeconds;
        }
        mCounterTextView.setText("TIME REMAINING: " + stringMinutes + ":" + stringSeconds);
    }


    @Override
    public void startSampleQuestion() {
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainer, new SampleQuestionFragment());
        ft.commit();
    }

    @Override
    public void startTest() {
        startTimer();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainer, new QuestionFragment());
        ft.commit();
    }


    @Override
    public void incrementCorrectScore() {
        numberOfCorrectAnswers += 1;
    }

    @Override
    public void finishTest() {
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainer, new ResultFragment());
        ft.commit();
    }

    @Override
    public void getNumberOfCorrectQuestions() {

    }
}
