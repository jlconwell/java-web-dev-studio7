package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<String> files = new ArrayList<>();
        files.add("Terrible Martin Lawrence movie.");
        files.add("Beep Boop.");

        DVD blueStreak = new DVD("Blue Streak",files, "DVD");

        System.out.println(blueStreak.toString());

        System.out.println(blueStreak.getFiles());

        CD aenema = new CD("Aenema", files, "CD");

        aenema.spin();
        blueStreak.spin();

        Wheel rim = new Wheel("Whack", files, "20");

        rim.spin();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
