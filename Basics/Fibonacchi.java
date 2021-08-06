package com.company;

import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = in.nextInt();
        int count = 2;

        while(n>=count){
           int temp = b;
b=a+b;
a= temp;
count++;
        }

        System.out.print(b);
    }
}
