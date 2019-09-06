package com.example.mensaapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mensaapp.R;

public class ResultFragment extends Fragment {
    private Integer numberOfCorrectQuestion=0;
    private TextView mNumberOfCorrectQuestions;

    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        mNumberOfCorrectQuestions = view.findViewById(R.id.NumberOfQuestionsTextView);

        Bundle arguments = getArguments();
        String bundles = arguments.getString("ANSWERS");
        numberOfCorrectQuestion = Integer.valueOf(bundles);

        mNumberOfCorrectQuestions.setText(numberOfCorrectQuestion.toString());

        return view;
    }

}
