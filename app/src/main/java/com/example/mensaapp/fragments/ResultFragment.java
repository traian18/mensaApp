package com.example.mensaapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mensaapp.MainActivity;
import com.example.mensaapp.R;

public class ResultFragment extends Fragment {
    private Integer numberOfCorrectQuestion=0;
    private TextView mResultTextView;
    private ImageView mResultImage;
    private TextView mResultDescription;
    private Button mBackToMainButton;

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
        mResultTextView = view.findViewById(R.id.result_textview);
        mResultImage = view.findViewById(R.id.iq_image);
        mResultDescription = view.findViewById(R.id.result_description_textview);
        mBackToMainButton = view.findViewById(R.id.back_to_main_button);


        Bundle arguments = getArguments();
        String bundles = arguments.getString("ANSWERS");
        numberOfCorrectQuestion = Integer.valueOf(bundles);

        if (numberOfCorrectQuestion == 9){
            mResultTextView.setText("75");
            mResultImage.setImageResource(R.drawable.iq_75);
            mResultDescription.setText(R.string.iq_75_description_text);
        } else if (numberOfCorrectQuestion == 10){
            mResultTextView.setText("80");
            mResultImage.setImageResource(R.drawable.iq_80);
            mResultDescription.setText(R.string.iq_80_description_text);
        } else if (numberOfCorrectQuestion == 11){
            mResultTextView.setText("85");
            mResultImage.setImageResource(R.drawable.iq_85);
            mResultDescription.setText(R.string.iq_85_description_text);
        } else if (numberOfCorrectQuestion == 12) {
            mResultTextView.setText("89");
            mResultImage.setImageResource(R.drawable.iq_89);
            mResultDescription.setText(R.string.iq_89_description_text);
        } else if (numberOfCorrectQuestion == 13) {
            mResultTextView.setText("93");
            mResultImage.setImageResource(R.drawable.iq_93);
            mResultDescription.setText(R.string.iq_93_description_text);
        } else if (numberOfCorrectQuestion == 14) {
            mResultTextView.setText("96");
            mResultImage.setImageResource(R.drawable.iq_96);
            mResultDescription.setText(R.string.iq_96_description_text);
        } else if (numberOfCorrectQuestion == 15) {
            mResultTextView.setText("100");
            mResultImage.setImageResource(R.drawable.iq_100);
            mResultDescription.setText(R.string.iq_100_description_text);
        } else if (numberOfCorrectQuestion == 16) {
            mResultTextView.setText("103");
            mResultImage.setImageResource(R.drawable.iq_103);
            mResultDescription.setText(R.string.iq_103_description_text);
        } else if (numberOfCorrectQuestion == 17) {
            mResultTextView.setText("107");
            mResultImage.setImageResource(R.drawable.iq_107);
            mResultDescription.setText(R.string.iq_107_description_text);
        } else if (numberOfCorrectQuestion == 18) {
            mResultTextView.setText("112");
            mResultImage.setImageResource(R.drawable.iq_112);
            mResultDescription.setText(R.string.iq_112_description_text);
        } else if (numberOfCorrectQuestion == 19) {
            mResultTextView.setText("116");
            mResultImage.setImageResource(R.drawable.iq_116);
            mResultDescription.setText(R.string.iq_116_description_text);
        } else if (numberOfCorrectQuestion == 20) {
            mResultTextView.setText("119");
            mResultImage.setImageResource(R.drawable.iq_119);
            mResultDescription.setText(R.string.iq_119_description_text);
        } else if (numberOfCorrectQuestion == 21) {
            mResultTextView.setText("122");
            mResultImage.setImageResource(R.drawable.iq_122);
            mResultDescription.setText(R.string.iq_122_description_text);
        } else if (numberOfCorrectQuestion == 22) {
            mResultTextView.setText("126");
            mResultImage.setImageResource(R.drawable.iq_126);
            mResultDescription.setText(R.string.iq_126_description_text);
        } else if (numberOfCorrectQuestion == 23) {
            mResultTextView.setText("126");
            mResultImage.setImageResource(R.drawable.iq_126);
            mResultDescription.setText(R.string.iq_126_description_text);
        } else if (numberOfCorrectQuestion == 24) {
            mResultTextView.setText("126");
            mResultImage.setImageResource(R.drawable.iq_126);
            mResultDescription.setText(R.string.iq_126_description_text);
        }  else if (numberOfCorrectQuestion <= 8) {
            mResultTextView.setText("You got a lower score than this test can measure!");
            mResultImage.setImageResource(R.drawable.iq_70);
            mResultDescription.setText(R.string.iq_70_description_text);
        }

        mBackToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
