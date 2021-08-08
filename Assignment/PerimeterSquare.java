package com.company;

import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        float length = input.nextFloat();
        double result = 4 * length;
        System.out.println(result);
    }
}
