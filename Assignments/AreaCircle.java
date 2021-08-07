package com.company;

import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Enter Length of Radius: ");
        float radius = in.nextFloat();
        double result =pi * radius * radius;
        System.out.println(result);
    }
}
