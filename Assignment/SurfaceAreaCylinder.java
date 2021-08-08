package com.company;

import java.util.Scanner;
import java.lang.Math;
public class SurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159265359;
        System.out.print("Enter radius & height: ");
        float radius = in.nextFloat();
        float height = in.nextFloat();
        double result = 2 * pi * radius * (height + radius);
        System.out.println(result);
    }
}
