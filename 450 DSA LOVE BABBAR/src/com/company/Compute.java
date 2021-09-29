package com.company;

class Compute {
    
    public void rotate(int[] arr, int n)
    {
        int temp = arr[n-1];
        arr[n-1] = arr[0];
        arr[0] = temp;
        for (int i = 1; i < n; i++) {
            int temp2 = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp2;
        }
    }
}