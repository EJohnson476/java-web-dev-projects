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
        int i = 1;
        for(MenuItem item : menuItems)
        {
            if(item.isNew && menuItems.indexOf(item) > menuItems.size() - 5)
            {
                System.out.println("This Item is New!");
            }
            System.out.println(i + ". Try our: " + item.getDescription() + " for " + item.getCategory() + " , only " + item.getPrice() + " !\n");
            i++;
        }
        return;
    }

    public void equalItems()
    {
        Scanner input3 = new Scanner(System.in);
        int item1;
        int item2;
        String answer;
        String remove;

        System.out.println("Would you like to compare two items?");
        answer = input3.next();

    while(answer.equalsIgnoreCase("yes"))
    {
        System.out.println("What is the number of the first item you'd like to compare?");
        item1 = input3.nextInt();
        System.out.println("What is the number of the second item you'd like to compare?");
        item2 = input3.nextInt();
        if (theMenu.get(item1 -1).getDescription().equalsIgnoreCase(theMenu.get(item2 -1).getDescription())) {
            System.out.println("The items are equal");
        } else {
            System.out.println("The items are not equal");
        }
        System.out.println("Would you like to add or remove an item?");
        remove = input3.next();
        if(remove.equalsIgnoreCase("yes"))
        {
            System.out.println("Would you like to Remove or Add?");
            remove = input3.next();
            if(remove.equalsIgnoreCase("Add"))
            {
                addMenuItem(theMenu);
            }
            else if(remove.equalsIgnoreCase("Remove"))
            {
                removeItem();
            }
        }
        System.out.println("Would you like to compare more items?");
        answer = input3.next();
    }
    }

    public void printSingleItem() {
        Scanner input1 = new Scanner(System.in);
        String answer;
        int num;
        MenuItem item;

        System.out.println("Would you like to print out a single item?");
        answer = input1.next();

        while(answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the number of the item.");
            num = input1.nextInt();
            item = theMenu.get(num -1);
            System.out.println("Try our: " + item.getDescription() + " for " + item.getCategory() + " , only " + item.getPrice() + " !\n");
            System.out.println("Would you like to see another item?");
            answer = input1.next();
        }

    }

    public void removeItem()
    {
        Scanner input2 = new Scanner(System.in);
        String answer;
        int num;
        System.out.println("Would you Like to remove an Item from the Menu?");
        answer = input2.next();
        while(answer.equalsIgnoreCase("yes"))
        {
            System.out.println("What is the number of the item you'd like to remove?");
            num = input2.nextInt();
            theMenu.remove(num -1);
            System.out.println("Would you like to remove another item?");
            answer = input2.next();
        }
        return;
    }

    //To add to Menu
    public void addMenuItem(ArrayList<MenuItem> theMenu) {
        Scanner input = new Scanner(System.in);
        MenuItem newItem;
        String answer;
        boolean isTrue = true;
        boolean isNew = true;

        System.out.println("Would you like to add an item to the menu? Yes or No ");
        answer = input.next();
        //input.nextLine();

       // System.out.println(answer);

        while (answer.equalsIgnoreCase("yes")) {
                Double price = 0.00;
                String description = "";
                String category = "";

                newItem = new MenuItem(isNew, price, description, category);

                System.out.println("Enter description for new item:");
                newItem.setDescription(input.next());

                //input.nextLine();

                System.out.println("Enter price for new item:");
                newItem.setPrice(input.nextDouble());

                input.nextLine();

                System.out.println("Enter category for new item:");
                newItem.setCategory(input.nextLine());

                theMenu.add(newItem);

                System.out.println("Would you like to add another item?");
                answer = input.next();
                input.nextLine();
        }

        //input.close();
        return;

    }

}
