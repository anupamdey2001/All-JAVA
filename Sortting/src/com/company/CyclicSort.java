package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
    int[] arr = {2,5,4,3,1};
    cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int value1, int value2){
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }
}

