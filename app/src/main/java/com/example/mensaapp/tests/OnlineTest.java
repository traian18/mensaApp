package com.example.mensaapp.tests;

import com.example.mensaapp.testmodule.Test;

public class OnlineTest extends Test {


    private void setUpTest(){
        super.setmNumberOfMiliseconds(60000);
    }

    @Override
    public int calculateScore(int correctAnswers) {
        return 0;
    }
}
