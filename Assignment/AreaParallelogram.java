package com.company;

import java.util.Scanner;
public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Length and Height: ");
        float length = in.nextFloat();
        float height = in.nextFloat();
        double area = length * height;
        System.out.println(area);
    }
}
