package com.company;

import java.util.Scanner;
import java.lang.Math;
public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius & Height: ");
        float radius = in.nextFloat();
        float height = in.nextFloat();
        double pi = 3.14159265359;
        double result = pi * Math.pow(radius,2) * height;
        System.out.println(result);
    }
}
