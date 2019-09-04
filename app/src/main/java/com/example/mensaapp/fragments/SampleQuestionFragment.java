package com.example.mensaapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mensaapp.R;
import com.example.mensaapp.TestActivity;

public class SampleQuestionFragment extends Fragment {

    private Button mContinueButton;
    private ImageView mQuestionImage;
    private int counter = 0;

    public SampleQuestionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sample_question1, container, false);
        mContinueButton = view.findViewById(R.id.continueButton);
        mQuestionImage = view.findViewById(R.id.questionImageView);


        mContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCounter() == 0) {
                    mQuestionImage.setImageResource(R.drawable.example2);
                    incrementCounter();
                } else {
                    ((TestActivity) getActivity()).startTest();
                }
            }
        });
        return view;
    }

    public interface SampleQuestionCallbackInterface {
        public void startTest();
    }

    private void incrementCounter(){
        counter += 1;
    }

    private int getCounter(){
        return counter;
    }
}
