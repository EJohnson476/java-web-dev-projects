package org.launchcode;
import java.util.ArrayList;

public class CheckBox extends Question
{
    ArrayList<String> options;
    public CheckBox(String theQuestion, String theAnswer, ArrayList<String> options)
    {
        super(theQuestion,theAnswer, options);
    }
}
