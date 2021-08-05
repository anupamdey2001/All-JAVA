package com.company;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Principle = ");
        double principle = in.nextInt();
        System.out.print("Time = ");
        double time = in.nextInt();
        System.out.print("Rate = ");
        double rate = in.nextInt();
        double simpleInterest = principle + (principle*rate*time)/100;
        System.out.println("SimpleInterest = " + simpleInterest);
    }
}
