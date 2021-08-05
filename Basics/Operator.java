package com.company;
import java.util.Objects;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double a = input.nextInt();
        System.out.print("Enter Second Number: ");
        double b = input.nextInt();
        System.out.print("Enter The Operator: ");
        String operator = input.next();
        if(Objects.equals(operator, "+")){
            System.out.println(a+b);
        }else if(Objects.equals(operator, "-")){
            System.out.println(a-b);
        }else if(Objects.equals(operator, "*")){
            System.out.println(a*b);
        }else {
            System.out.println(a/b);
        }
    }
}
