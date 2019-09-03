package com.example.mensaapp.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mensaapp.R;

public class SampleQuestion1Fragment extends Fragment {

    private Button mContinueButton;
    private ImageView mQuestionImage;

    public SampleQuestion1Fragment() {
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
                mQuestionImage.setImageResource(R.drawable.example2);
            }
        });
        return view;
    }

    public interface SampleQuestion1CallbackInterface {
        void onFragmentInteraction(Uri uri);
    }
}
