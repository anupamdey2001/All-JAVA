package com.company;
import java.util.Scanner;
public class Inputs
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
//        System.out.print("Please Enter Your Roll Number:");
        System.out.print("Please Enter Your Float Number:");
//        int rollNo = input.nextInt();
//        System.out.println("Your Roll No is " + rollNo);
        float inputFloat = input.nextFloat();
        System.out.println(inputFloat);
    }
}
