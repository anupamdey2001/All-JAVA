package com.company;
import java.util.Scanner;
public class InputSumAndLargeNumber {
    public static void main(String[] args) {

        int counter = 0;
        int numbers = 0;
        double large = 0;
        double sum = 0;
        Scanner in = new Scanner(System.in);
        while((numbers = in.nextInt()) != 0){
            if (numbers != 0)
            sum = numbers + sum;
            counter++;
            if (numbers > large)
                large = numbers;
        }
        if(counter > 0){
            System.out.println("The largest integer is: " + large);
            System.out.println("The Sum is: " + sum);
        }else{
            System.out.println("No data was entered.");
        }
    }
}
