package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator =  new FlavorComparator();
        Comparator comparator1 = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(comparator);
        System.out.print(flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        cones.sort(comparator1);
        System.out.print(cones);
        }



        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

    }