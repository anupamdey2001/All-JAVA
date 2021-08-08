package com.company;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Length and Height: ");
        double length = in.nextDouble();
        double height = in.nextDouble();
        double area = 0.5 * length * height;
        System.out.println(area);
    }
}
