package com.company;

import java.util.Scanner;

public class SwapExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String swapping = swap(10,20);
        System.out.println(swapping);
    }
    static String swap(int a, int b){
        int temp = a;
        a=b;
        b = temp;
        return a + " " + b;
    }
}
