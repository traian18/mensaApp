package com.example.mensaapp.testmodule;

import android.media.Image;

import java.util.List;

public abstract class Question {

    private String question;
    private List<String> questionImages;
    private List<Image> answerImages;
    private String correctAnswer;


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getQuestionImages() {
        return questionImages;
    }

    public void setQuestionImages(List<String> questionImages) {
        this.questionImages = questionImages;
    }

    public List<Image> getAnswerImages() {
        return answerImages;
    }

    public void setAnswerImages(List<Image> answerImages) {
        this.answerImages = answerImages;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
