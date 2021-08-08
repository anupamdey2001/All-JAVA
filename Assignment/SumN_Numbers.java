package com.company;
import java.util.Scanner;
public class SumN_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number with using Space : ");
        float N = input.nextFloat();
        float sum = (N*(N+1))/2;
        System.out.println(sum);
    }
}
