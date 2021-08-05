package com.company;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println(num1);
        }else if (num1 < num2){
            System.out.println(num2);
        }else {
            System.out.println("Equal!!");
        }
    }
}
