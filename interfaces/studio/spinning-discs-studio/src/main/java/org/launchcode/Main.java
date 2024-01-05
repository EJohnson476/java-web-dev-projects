package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
    CD cd = new CD(400, "Game of Thrones.", 0.700, "CD");
    DVD dvd = new DVD(1000, "Breaking Bad.", 4.500, "DVD");
    cd.spinDisc();
    dvd.spinDisc();
    System.out.println("The Movie on the CD is " + cd.getName());
    System.out.println("The DVD is currently spinning at " + dvd.getSpinSpeed() + " rpm and will play " + dvd.getName());
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}