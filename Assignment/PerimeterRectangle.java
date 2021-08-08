package com.company;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of Length & Width: ");
        float l = input.nextFloat();
        float w = input.nextFloat();
        double result = 2*(l + w);
        System.out.println(result);
    }
}
