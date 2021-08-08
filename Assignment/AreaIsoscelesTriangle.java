package com.company;

import java.util.Scanner;
import java.lang.Math;
public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float length = input.nextFloat();
        double result = 0.5 * Math.pow(length, 2);
        System.out.println(result);
    }
}
