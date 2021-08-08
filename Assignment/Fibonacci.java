package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        for (int i =2; i<n; i++) {
            int temp = a + b;
            System.out.print(" " + temp);
            a=b;
            b=temp;

        }

    }
}
