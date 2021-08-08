package com.company;

import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of Length & Width: ");
        float length = input.nextFloat();
        float weight = input.nextFloat();
        double result = 2*(length + weight);
        System.out.println(result);
    }
}
