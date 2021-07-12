package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("\nFlavors");
        System.out.println(flavors);
        System.out.println("\nCones");
        System.out.println(cones);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        System.out.println("\nFlavors after sort:");
        System.out.println(flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
