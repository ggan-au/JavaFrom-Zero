package com.itbulls.learnit.operations;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter length of side A: ");
        int a = Integer.parseInt(console.next());
        System.out.println("Enter length of side B: ");
        int b = Integer.parseInt(console.next());
        System.out.println("Enter length of side C: ");
        int c = Integer.parseInt(console.next());

        int p = (a + b + c) / 2;
        double area = Math.sqrt((p-a) * (p-b) * (p-c));

        if (area <= 0){
            System.out.println("NaN");
            return;
        }
        System.out.println(String.format("%.2f", area));

    }
}
