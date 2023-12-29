package org.launchcode;

import java.util.ArrayList;
public abstract class Question {

    private String theQuestion;
    private String theAnswer;
    private ArrayList<String> options;
    public Question(String theQuestion, String theAnswer, ArrayList<String> options)
    {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
        this.options = options;
    }

    public void setQuestion(String question)
    {
        this.theQuestion = question;
    }

    public void setAnswer(String answer)
    {
        this.theAnswer = answer;
    }

    public String getQuestion()
    {
        return theQuestion;
    }

    public String getAnswer()
    {
        return theAnswer;
    }

    public void setOptions(ArrayList<String> options)
    {
        this.options = options;
    }

    public ArrayList<String> getOptions()
    {
        return options;
    }
}

