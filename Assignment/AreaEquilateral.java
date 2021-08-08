package com.company;

import java.util.Scanner;
import java.lang.Math;
public class AreaEquilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Length: ");
        float length = in.nextFloat();
        double result = (Math.sqrt(3)/4) * Math.pow(length,2);
        System.out.println(result);
    }
}
