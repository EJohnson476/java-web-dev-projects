package org.launchcode;

import java.util.Scanner;
public class Area {
        public static void main (String[]args)
        {
            Scanner input = new Scanner(System.in);
            double radius;

            System.out.println("Enter a radius: ");
            radius = input.nextDouble();

            System.out.println("The area of a circle with radius of " + radius + " is: " + Circle.getArea(radius));




        }
    }

