package com.company;

import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int originalNumber = n;
        int number = 0;
        while(n>0){
            int element = n % 10;
            number = number + (int) Math.pow(element,3);
            n = n/10;
        }
        if(number == originalNumber){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
