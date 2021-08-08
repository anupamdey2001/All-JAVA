package com.company;

import java.util.Scanner;
import  java.lang.Math;
public class VolumeCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();
        System.out.print("Enter the Height: ");
        float height = input.nextFloat();
        double pi = 3.14159265359;
        double result = pi * Math.pow(radius, 2) * (height/3);
        System.out.println(result);
    }
}
