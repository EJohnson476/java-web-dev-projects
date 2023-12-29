package org.launchcode;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class TrueFalse extends Question
{
    private ArrayList<String> options;
    public TrueFalse(String theQuestion, String theAnswer, ArrayList<String> options)
    {
        super(theQuestion,theAnswer,options);
    }
}
