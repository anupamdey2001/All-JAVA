package com.company;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
               if(arr[j] < arr[j-1])
                   swap(arr, j, j-1);
               else
                   break;
            }
        }
    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //maximum finding
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }
static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
}
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static void bubble(int[] arr){
        boolean swapped;//for performing O(N) complexity //For Best Case
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step,  max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    swap(arr, j-1, j);
                    swapped = true;
                }
            }
            //if you did not swap for  a particular value of i, it means the array is sorted hence stop the program
            if (!swapped)//!false = true
            break;
        }
    }
}
