package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Date time = new Date();
        boolean isNew = false;
        ArrayList<MenuItem> daMenu = new ArrayList<>()
        {
            {
                add(new MenuItem(false,99.99,"Steak","Dinner"));
                add(new MenuItem(false,15.99,"Burger & Fries","Lunch"));
                add(new MenuItem(false,12.99,"Bacon & Eggs","Breakfast"));
            }
        };
        int currentYear = time.getYear() + 1900;
        Menu mainMenu = new Menu(daMenu, currentYear, time.getMonth() + 1 ,time.getDate());
        System.out.println("The date is: " + mainMenu.getTime());
        mainMenu.addMenuItem(daMenu);
        if(daMenu.get(daMenu.size()-1).itemTime() != null && daMenu.get(daMenu.size()-1).isNew) {
            System.out.println("The menu was last updated: " + daMenu.get(daMenu.size() - 1).itemTime());
        }
        mainMenu.printMenu(daMenu);
        mainMenu = new Menu(daMenu, currentYear, time.getMonth() + 1 ,time.getDate());
        mainMenu.printSingleItem();
        mainMenu.removeItem();
        mainMenu.printMenu(daMenu);
        mainMenu.equalItems();
    }
}
