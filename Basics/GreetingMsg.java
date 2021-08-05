package com.company;
import java.util.Scanner;
public class GreetingMsg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter You Name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + " nice to see you");
    }
}
