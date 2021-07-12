package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;
public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {

//        if/else if/else block to evaluate o1.getCost() - o2.getCost();

        System.out.println("Cone A cost");
        System.out.println(o1.getCost());
        System.out.println("Cone B cost");
        System.out.println(o2.getCost());
        System.out.println("Cones ");
        System.out.println(o1.getCost() - o2.getCost());

        if (o1.getCost() > o2.getCost() ) {
            return 1;
        }
        else if (o1.getCost() < o2.getCost()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
