package com.company;

import java.util.Scanner;

public class MaximumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,55,66};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
