package com.company;
import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Even Number!");
        }else{
            System.out.println("Odd Number!");
        }
    }
}
