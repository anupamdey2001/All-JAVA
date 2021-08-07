package com.company;

import java.util.Scanner;
import java.lang.Math;
public class VolumeSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159265359;
        System.out.print("Enter the Radius: ");
        float radius = input.nextFloat();
        double result = 1.33333333333 * pi * Math.pow(radius,3);
        System.out.println(result);
    }
}
