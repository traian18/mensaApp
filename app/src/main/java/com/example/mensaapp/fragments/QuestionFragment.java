package com.example.mensaapp.fragments;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mensaapp.R;
import com.example.mensaapp.TestActivity;

public class QuestionFragment extends Fragment {

    private TypedArray mQuestionList;
    private String[] mAnswerList;
    private TextView mQuestionNumber;
    private int questionCounter;
    private int numberOfQuestions;

    private ImageView questionImageView;

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
        mQuestionList = getResources().obtainTypedArray(R.array.question_list);
        mAnswerList = getResources().getStringArray(R.array.answer_list);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question, container, false);
        mQuestionNumber = view.findViewById(R.id.questionNumberTextView);
        questionImageView = view.findViewById(R.id.questionImageView);

        mSelectionAButton = view.findViewById(R.id.SelectAButton);
        mSelectionBButton = view.findViewById(R.id.SelectBButton);
        mSelectionCButton = view.findViewById(R.id.SelectCButton);
        mSelectionDButton = view.findViewById(R.id.SelectDButton);
        mSelectionEButton = view.findViewById(R.id.SelectEButton);


        mSelectionAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer("a");
            }
        });

        mSelectionBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer("b");
            }
        });

        mSelectionCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer("c");
            }
        });

        mSelectionDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer("d");
            }
        });

        mSelectionEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer("e");
            }
        });

        return view;
    }

    private void checkAnswer(String answer) {
        Toast.makeText(getContext(), "Answer: " + answer + " Correct Answer = " + mAnswerList[questionCounter], Toast.LENGTH_SHORT).show();

        if (answer.equals(mAnswerList[questionCounter])) {
            ((TestActivity) getActivity()).incrementCorrectScore();
        }
        switchToNextQuestion();
    }

    public void switchToNextQuestion() {
        if (questionCounter == 24)
            ((TestActivity)getActivity()).finishTest();

        questionCounter += 1;
        Drawable image = mQuestionList.getDrawable(questionCounter);
        questionImageView.setImageDrawable(image);
        int questionNumber = questionCounter + 1;
        questionNumberFormater();
    }

    private void questionNumberFormater(){
        numberOfQuestions = mQuestionList.length();
        String currentQuestionFromatedNumber = String.valueOf(questionCounter+1) + "/" + String.valueOf(numberOfQuestions);
        mQuestionNumber.setText(currentQuestionFromatedNumber);
    }

    public interface QuestionCallBackInterface {
        public void incrementCorrectScore();
        public void finishTest();
    }
}
