package com.company;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        if(n==0) {
            System.out.println(false);
            return;
        }
        boolean ans = (n & (n-1))  == 0;
        System.out.println(ans);
    }
}
