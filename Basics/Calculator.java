package com.company;

import java.util.Scanner;
//Press X or x for exit the program
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        while (true){
            System.out.print("Enter a operator: ");
            char operation = in.next().trim().charAt(0);
            if(operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%'){
                System.out.print("Enter The Two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(operation == '+'){
                    answer = num1+num2;
                }
                if(operation == '-'){
                    answer = num1-num2;
                }
                if(operation == '*'){
                    answer = num1*num2;
                }
                if(operation == '/') {
                    if (num2 != 0) {
                        answer = num1 / num2;
                    }
                }
                if(operation == '%'){
                    answer = num1%num2;
                }
            }else if(operation == 'x' || operation == 'X'){
                break;
            }else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println(answer);
        }
    }
}
