package com.company;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        //Search for missing
        for(int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1)
                return index+1;
        }

        return arr.length;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
