package com.company;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr, i, arr[i]);
            }else{
                i++;
            }
        }
        //Search for missing
        for(int index = 0; index < arr.length; index++) {
            if (arr[index] != index)
                return index;
        }

       return arr.length;
    }
    static void swap(int[] arr, int value1, int value2){
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }
}