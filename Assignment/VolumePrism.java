package com.company;

import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base Area & Height: ");
        float baseArea = input.nextFloat();
        float height = input.nextFloat();
        double result = baseArea * height;
        System.out.println(result);
    }
}
