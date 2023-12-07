package org.launchcode;

//import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

import java.util.ArrayList;

public class Menu {
    public static void printMenu() {
        Double price = 0.00;
        String description = "steak";
        String category = "dinner";
        ArrayList<Object> theMenu = new ArrayList<>();

        MenuItem item1 = new MenuItem(price,description,category);
        item1.setPrice(99.99);
        item1.setDescription("steak");
        item1.setCategory("dinner");
        theMenu.add(item1);
        System.out.println(item1.getPrice());

        //To display Menu
        for(Object item : theMenu)
        {
            System.out.println("Try our :" + item.getPrice());
        }


    }

/*
        //To add to Menu
        private static void addMenuItem (ArrayList < Object > theMenu) {
            Scanner input = new Scanner(System.in);
            MenuItem newItem;
            String answer;
            boolean isTrue = true;


            System.out.println("Would you like to add an item to the menu? Yes or No ");
            answer = input.next();

            System.out.println(answer);

            if (answer.equalsIgnoreCase("yes")) {

                do {
                    Double price = 0.00;
                    String description = "";
                    String category = "";

                   MenuItem newItem = new MenuItem(price, description, category);

                    System.out.println("Enter price for new item:");
                    newItem.setPrice(Double.toString(input.nextDouble()));
                    System.out.println("Enter description for new item:");
                    newItem.setDescription(input.next());
                    System.out.println("Enter category for new item:");
                    newItem.setCategory(input.next());

                    theMenu.add(newItem);

                    System.out.println("Would you like to add another item?");
                    answer = input.next();

                    if (answer.equalsIgnoreCase("no")) {
                        isTrue = false;
                    }
                }
                while (isTrue);
            }

            input.close();
            //  System.out.println(theMenu);

        }

 */
    }
