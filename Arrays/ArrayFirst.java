package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        //Array of primitives
//        int[] rno1 = {1,2,3};
//        //Array of objects
//        String[] arr = new String[5];
//        System.out.println(arr[4]);
//        rno1[0] = 100;
//        System.out.println(rno1[0]);
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
//        for (String number :
//                str) {
//            System.out.println(number + "  ");
//        }
        System.out.println(Arrays.toString(str));
    }
}
