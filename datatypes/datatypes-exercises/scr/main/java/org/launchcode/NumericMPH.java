package org.launchcode;

import java.util.Scanner;

public class NumericMPH {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many miles have you driven?");
    Double miles = input.nextDouble();
    System.out.println("How many gallons of gas have you consumed?");
    Double gasUsed = input.nextDouble();
    Double mpg = miles/gasUsed;
    System.out.println("You consumed " + mpg + " miles per gallon.");
    }
}
