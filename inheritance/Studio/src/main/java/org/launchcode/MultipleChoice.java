package org.launchcode;

import java.util.ArrayList;

public class MultipleChoice extends Question
{
    private ArrayList<String> options;
    public MultipleChoice(String theQuestion, String theAnswer, ArrayList<String> options )
    {
        super(theQuestion, theAnswer, options);
    }
}

