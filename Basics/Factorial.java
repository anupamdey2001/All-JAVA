package com.company;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range of Factorial: ");
        int range = input.nextInt();
        int facto=1;
        for(int i=1;i<=range;i++){
            facto = facto * i;
        }
        System.out.println(facto);
    }
}
