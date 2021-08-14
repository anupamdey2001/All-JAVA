package com.company;

public class CallNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        for (int rows = 0; rows < arr.length; rows++) {
            for (int column = 0; column < arr[rows].length; column++) {
                System.out.print(arr[rows][column] + " ");
            }
            System.out.println();
        }
    }
}
