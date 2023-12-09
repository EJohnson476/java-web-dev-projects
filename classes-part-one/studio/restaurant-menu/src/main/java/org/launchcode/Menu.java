package org.launchcode;

//import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.Scanner;

import java.util.ArrayList;

public class Menu {

    ArrayList<MenuItem> theMenu = new ArrayList<>();
    int day;
    int year;
    int month;

    public Menu(ArrayList<MenuItem> theMenu, int year, int month, int day)
    {
        this.theMenu = theMenu;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getTime()
    {
        String time = month + "/" + day + "/" + year ;

        return(time);
    }

    public void printMenu(ArrayList<MenuItem> menuItems)
    {
        for(MenuItem item : menuItems)
        {
            int i = 0;
            if(item.isNew && menuItems.indexOf(item) > menuItems.size() - 5)
            {
                System.out.println("This Item is New!");
            }
            System.out.println("Try our: " + item.getDescription() + " for " + item.getCategory() + " , only " + item.getPrice() + " !\n");
            i++;
        }
    }
    //To add to Menu
    public void addMenuItem(ArrayList<MenuItem> theMenu) {
        Scanner input = new Scanner(System.in);
        MenuItem newItem;
        String answer;
        boolean isTrue = true;
        boolean isNew = true;

        System.out.println("Would you like to add an item to the menu? Yes or No ");
        answer = input.nextLine();
        //input.nextLine();

       // System.out.println(answer);

        if (answer.equalsIgnoreCase("yes")) {

            do {
                Double price = 0.00;
                String description = "";
                String category = "";

                newItem = new MenuItem(isNew, price, description, category);

                System.out.println("Enter description for new item:");
                newItem.setDescription(input.nextLine());

                //input.nextLine();

                System.out.println("Enter price for new item:");
                newItem.setPrice(input.nextDouble());

                input.nextLine();

                System.out.println("Enter category for new item:");
                newItem.setCategory(input.nextLine());

                theMenu.add(newItem);

                System.out.println("Would you like to add another item?");
                answer = input.nextLine();
                input.nextLine();

                if (answer.equalsIgnoreCase("no")) {
                    isTrue = false;
                }
            }
            while (isTrue);
        }

        input.close();
        //return theMenu;

    }

}
