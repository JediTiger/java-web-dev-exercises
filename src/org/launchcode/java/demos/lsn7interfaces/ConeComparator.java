package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;
public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {

//        if/else if/else block to evaluate o1.getCost() - o2.getCost();

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
