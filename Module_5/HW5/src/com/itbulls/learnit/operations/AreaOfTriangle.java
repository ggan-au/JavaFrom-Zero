package com.itbulls.learnit.operations;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("This program will calculate the area of a triangle.");
        System.out.println("Enter length of side A: ");
        double aSide = console.nextDouble();

        System.out.println("Enter length of side B: ");
        double bSide = console.nextDouble();

        System.out.println("Enter length of side C: ");
        double cSide = console.nextDouble();

        double p = (aSide + bSide + cSide) / 2;
        double triangleArea = Math.sqrt(p * (p-aSide) * (p-bSide) * (p-cSide));

        System.out.printf("%.2f", triangleArea);

    }
}
