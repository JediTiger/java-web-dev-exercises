package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Flavor extends Ingredient {
    public Flavor(String aName, double aCost, ArrayList<String> someAllergens) {
        super (aName, aCost, someAllergens);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Cost: $" + getCost() + "\n" +
                "Allergens: " + getAllergens() + "\n";
    }
}
