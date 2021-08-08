package com.company;

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of diagonal1 & diagonal2: ");
        float d1 = input.nextFloat();
        float d2 = input.nextFloat();
        double result = 0.5 * d1 * d2;
        System.out.println(result);
    }
}
