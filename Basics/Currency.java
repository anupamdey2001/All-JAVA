package com.company;
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Currency in Rupees: ");
        double rupees = in.nextDouble();
        double dollars = rupees * 0.013;
        System.out.println("Enter the Currency in Dollars is : " + dollars + "$");
    }
}
