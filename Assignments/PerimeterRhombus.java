package com.company;

import java.util.Scanner;

public class PerimeterRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        float l = input.nextFloat();
        double result = 4 * l;
        System.out.println(result);
    }
}
