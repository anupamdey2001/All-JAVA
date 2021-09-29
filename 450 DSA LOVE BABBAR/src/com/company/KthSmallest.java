package com.company;

public class KthSmallest {
    public static void main(String[] args) {
    int[] arr = {7, 10, 4, 20, 15};
        System.out.println(smallest(arr, 3));
    }
    static int smallest(int[] arr, int k){
        int small = arr[0];
        for (int i = 0; i < k - 1; i++) {
            if (small > arr[i])
                small = arr[i];
        }
        return small;
    }
}
