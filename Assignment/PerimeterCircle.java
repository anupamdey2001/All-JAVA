package com.company;

import java.util.Scanner;
import java.lang.Math;
public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Radius: ");
        float radius = in.nextFloat();
        double pi = 3.14159265359;
        double result = 2 * pi * radius;
        System.out.println(result);
    }
}
