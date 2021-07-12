package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import org.launchcode.java.demos.lsn7interfaces.Flavor;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        Comparator comparatorF = new FlavorComparator();

        flavors.sort(comparatorF);

        System.out.println("\nFlavors after sort:");
        System.out.println(flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        System.out.println("\nCones before sort");
        System.out.println(cones);

        Comparator comparatorC = new ConeComparator();

        cones.sort(comparatorC);

        System.out.println("\nCones after sort:");
        System.out.println(cones);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("\nFlavors (after sort):");
        System.out.println(flavors.toString());

        System.out.println("\nCones (after sort):");
        System.out.println(cones.toString());

    }
}
