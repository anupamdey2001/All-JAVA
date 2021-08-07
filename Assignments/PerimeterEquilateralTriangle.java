package com.company;

import java.util.Scanner;
import java.lang.Math;
public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of side: ");
        float length = input.nextFloat();
        double result = 3 * length;
        System.out.println(result);
    }
}
