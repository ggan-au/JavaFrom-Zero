package com.itbulls.learnit.operations;

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("This program will calculate circle circumference.");
        System.out.println("Enter circle radius: ");
        double radius = console.nextInt();

        double circumference = 2 * radius * Math.PI;

        System.out.printf("%.2f", circumference);
    }
}
