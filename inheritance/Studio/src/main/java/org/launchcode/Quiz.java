package org.launchcode;

import java.util.ArrayList;

import java.util.Scanner;

public class Quiz {

    Scanner input = new Scanner(System.in);
    String answer;
    double numberCorrect = 0;
    public ArrayList<Question> theQuiz;

    public Quiz(ArrayList<Question> theQuiz) {
        this.theQuiz = theQuiz;
    }


    public void runQuiz(ArrayList<Question> theQuiz) {
        for (Question question : theQuiz) {

            if (question.getClass().toString().equalsIgnoreCase("class org.launchcode.MultipleChoice")) {
                System.out.println("Select the best answer by entering a letter.");
                System.out.println((theQuiz.indexOf(question) + 1) + ": " + question.getQuestion());
                System.out.println(question.getOptions());
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(question.getAnswer())) {
                    numberCorrect++;
                }
            }

            if (question.getClass().toString().equalsIgnoreCase("class org.launchcode.TrueFalse")) {
                System.out.println("Select the best answer by entering either True or False.");
                System.out.println(question.getQuestion());
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(question.getAnswer())) {
                    numberCorrect++;
                }
            }

            if (question.getClass().toString().equalsIgnoreCase("class org.launchcode.CheckBox")) {
                System.out.println("Select the best answer(s) by entering the number(s) of the correct option(s).\nIf you select multiple only separate by , EX: 1,2,3.");
                System.out.println(question.getQuestion());
                System.out.println(question.getOptions());
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(question.getAnswer())) {
                    numberCorrect++;
                }
            }
        }
    }

    public void addQuestion(ArrayList<Question> theQuiz) {
        String newQuestion;
        String newAnswer;
        String optionChoice;
        String answerChoices;
        int choices;

        System.out.println("Would you like to add a question to the quiz? Yes or No?");
        answer = input.nextLine();

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("What type of question would you like to add?\n1. Multiple choice\n2. True or False\n3. CheckBox");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("Multiple choice") || answer.equalsIgnoreCase("1")) {
                ArrayList<String> newOptions = new ArrayList<>();
                System.out.println("Enter the question you'd like to add.");
                newQuestion = input.nextLine();
                System.out.println("Enter the correct answer to the question you entered.");
                newAnswer = input.nextLine();
                System.out.println("Enter the following answer choices in format: A: option choice");
                for (int i = 1; i < 5; i++) {
                    System.out.println("Enter choice number " + i);
                    optionChoice = input.nextLine();
                    newOptions.add(optionChoice);
                }
                MultipleChoice newMultiple = new MultipleChoice(newQuestion, newAnswer, newOptions);
                theQuiz.add(newMultiple);
            }

            if (answer.equalsIgnoreCase("True or False") || answer.equalsIgnoreCase("2")) {
                ArrayList<String> newOptions = new ArrayList<>();
                System.out.println("Enter the True or False question you'd like to add.");
                newQuestion = input.nextLine();
                System.out.println("Enter the correct answer to the question you entered.");
                newAnswer = input.nextLine();

                newOptions.add("True");
                newOptions.add("False");

                TrueFalse newTF = new TrueFalse(newQuestion, newAnswer, newOptions);
                theQuiz.add(newTF);
            }

            if (answer.equalsIgnoreCase("CheckBox") || answer.equalsIgnoreCase("3")) {
                ArrayList<String> newOptions = new ArrayList<>();
                System.out.println("Enter the CheckBox question you'd like to add.");
                newQuestion = input.nextLine();
                System.out.println("Enter the correct answer(s) to the question you entered using this format: 1,2,5");
                newAnswer = input.nextLine();
                System.out.println("How many answer options would you like?");
                answerChoices = input.nextLine();
                choices = Integer.parseInt(answerChoices);
                System.out.println("Enter the following answer choices in format: 1: option choice");
                for (int i = 1; i < choices + 1; i++) {
                    System.out.println("Enter choice number " + i);
                    optionChoice = input.nextLine();
                    newOptions.add(optionChoice);
                }
                CheckBox newCheck = new CheckBox(newQuestion, newAnswer, newOptions);
                theQuiz.add(newCheck);
            }
            System.out.println("Would you like to add another question? Yes or No?");
            answer = input.nextLine();
        }
    }

    public void gradeQuiz() {
        double grade = (double) Math.round((numberCorrect / theQuiz.size()) * 100);
        System.out.println("Your grade for the quiz is: " + grade + "%.");
        return;
    }
}