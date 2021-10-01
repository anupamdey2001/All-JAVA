package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 10;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1)==1;//if 1 is true then Odd else Even number
    }
}
