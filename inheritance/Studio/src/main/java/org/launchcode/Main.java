package org.launchcode;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Question> theQuiz = new ArrayList<>();

            ArrayList<String> multipleChoice = new ArrayList<>()
            {
                {
                    add("A: Andrew Jackson");
                    add("B: Theodore Roosevelt");
                    add("C: Abraham Lincoln");
                    add("D: George Washington");
                }
            };
            MultipleChoice question1 = new MultipleChoice("Who was the first President of The USA.", "D", multipleChoice);
            theQuiz.add(question1);

            ArrayList<String> trueFalse = new ArrayList<>()
            {
                {
                    add("True");
                    add("False");
                }
            };
            TrueFalse question2 = new TrueFalse("True or False?\nThe tallest mountain in the world is Everest.", "True", trueFalse);
            theQuiz.add(question2);



            ArrayList<String> checkBox = new ArrayList<>()
            {
                {
                    add("1. 4");
                    add("2. 5");
                    add("3. 2^2");
                }
            };
            CheckBox question3 = new CheckBox("Which are the right answer to: 2 + 2?","1,3",checkBox);
            theQuiz.add(question3);

            Quiz daQuiz = new Quiz(theQuiz);
            daQuiz.addQuestion(theQuiz);
            daQuiz.runQuiz(theQuiz);
            daQuiz.gradeQuiz();
        }
    }

