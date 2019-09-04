package com.example.mensaapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mensaapp.R;
import com.example.mensaapp.TestActivity;


public class TestInstructionFragment extends Fragment {

    private Button mStartTestButton;

    public TestInstructionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test_instruction, container, false);
        mStartTestButton = view.findViewById(R.id.takeTestButton);

        mStartTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TestActivity) getActivity()).startSampleQuestion();
            }
        });

        return view;
    }

    public interface InstructionCallbackInterface {
        public void startSampleQuestion();
    }
}
