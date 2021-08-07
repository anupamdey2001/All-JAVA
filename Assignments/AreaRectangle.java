package com.company;
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Length & width: ");
        float length = in.nextFloat();
        float width = in.nextFloat();
        double result = length * width;
        System.out.println(result);
    }
}
