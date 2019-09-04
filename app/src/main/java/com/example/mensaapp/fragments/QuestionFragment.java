package com.example.mensaapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mensaapp.R;

import java.util.HashMap;
import java.util.Map;

public class QuestionFragment extends Fragment {

    private Map<Integer, String> mQuestionList = new HashMap<>();
    private TextView mQuestionNumber;
    private int questionCounter = 0;
    private String currentCorrectAnswer;

    private Button mSelectionAButton;
    private Button mSelectionBButton;
    private Button mSelectionCButton;
    private Button mSelectionDButton;
    private Button mSelectionEButton;

    public QuestionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        populateQuestionsList();

    }

    private void populateQuestionsList() {
        mQuestionList.put(R.drawable.item1, "e");
        mQuestionList.put(R.drawable.item2, "c");
        mQuestionList.put(R.drawable.item3, "c");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_question, container, false);
        mQuestionNumber = view.findViewById(R.id.questionNumberTextView);

        mSelectionAButton = view.findViewById(R.id.SelectAButton);
        mSelectionBButton = view.findViewById(R.id.SelectBButton);
        mSelectionCButton = view.findViewById(R.id.SelectCButton);
        mSelectionDButton = view.findViewById(R.id.SelectDButton);
        mSelectionEButton = view.findViewById(R.id.SelectEButton);


        mSelectionAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mSelectionBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mSelectionCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mSelectionDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mSelectionEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }


    public void switchToNextQuestion(){

    }

    public interface QuestionCallBackInterface {
        public void updateScore();
        public void incrementCorrectScore();
    }
}
