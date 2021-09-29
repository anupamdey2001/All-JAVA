package com.company;


public class MoveAllNegative {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        negative(arr);
        printArray(arr);
    }

    static void negative(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static void printArray (int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
    }
}
