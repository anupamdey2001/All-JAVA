package com.company;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        int n = in.nextInt();
        int c = 2;
        if (n<=1){
            System.out.println("Neither Prime nor Composite");
            return;
        }else {
            while(c*c<n){
                if(n%c==0){
                    System.out.println("Not Prime");
                    return;
                }
                c++;
            }
            if (c*c>n){
                System.out.println("Prime");
            }
        }
    }
}

