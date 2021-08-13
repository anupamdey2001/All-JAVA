package com.company;

import java.util.Scanner;
public class MultiDimentionalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr2D = new int[3][4];
        for (int rows = 0; rows < arr2D.length; rows++) {
            for (int column = 0; column < arr2D[rows].length; column++) {
                arr2D[rows][column] = input.nextInt();
            }
        }
//        for (int rows = 0; rows < arr2D.length; rows++) {
//            for (int column = 0; column < arr2D[rows].length; column++) {
//                System.out.println(arr2D[rows][column]);
//            }
//        }
        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
