package com.company;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
	int[] arr = {1,2,3};
        reverse(arr);
    }
    static void reverse(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            swap(arr,n-1,i);
            n-=1;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
