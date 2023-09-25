package org.launchcode;

import java.util.Scanner;



public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius for your circle");
        double radius = input.nextDouble();
        if (radius < 0) {
            System.out.println("Error. Please enter a positive number");
        } else {
            input.close();
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is " + area);
        }
    }
}
