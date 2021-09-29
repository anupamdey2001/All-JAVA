package com.company;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,66,77,2,1};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }
}
