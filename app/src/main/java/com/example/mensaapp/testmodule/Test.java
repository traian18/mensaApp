package com.example.mensaapp.testmodule;

import java.util.List;

public abstract class Test {

    private List<Question> testAnswers;
    private String testDescription;
    private int mNumberOfMiliseconds;

    public List<Question> getTestAnswers() {
        return testAnswers;
    }

    public void setTestAnswers(List<Question> testAnswers) {
        this.testAnswers = testAnswers;
    }

    public String getTestDescription() {
        return testDescription;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

    public int getmNumberOfMiliseconds() {
        return mNumberOfMiliseconds;
    }

    public void setmNumberOfMiliseconds(int mNumberOfMiliseconds) {
        this.mNumberOfMiliseconds = mNumberOfMiliseconds;
    }

    /**
     * Calculates the score of the test based on the number of correct questions
     */
    public abstract int calculateScore(int correctAnswers);
}
