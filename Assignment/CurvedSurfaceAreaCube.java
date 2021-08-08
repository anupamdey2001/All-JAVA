package com.company;

import java.util.Scanner;
import java.lang.Math;
public class CurvedSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of Side: ");
        float side = input.nextFloat();
        double result = Math.pow(side, 3);
        System.out.println(result);
    }
}
