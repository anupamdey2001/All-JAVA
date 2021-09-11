package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumber {
    public static void main(String[] args) {
int[] arr = {4,3,2,7,8,2,3,1};
//        System.out.println(Arrays.toString(findDisappearedNumbers(arr)));
    }
    static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
        //Search for missing number
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1)
                ans.add(index+1);
        }

        return ans;
    }
    static void swap(int[] arr, int value1, int value2){
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }
}


//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int correctIndex = arr[i] -1;
//            if (arr[i] != arr[correctIndex]){
//                swap(arr, i, correctIndex);
//            }else {
//                i++;
//            }
//        }
//        //Search for missing number
//        List<Integer> ans = new ArrayList<>();
//        for(int index = 0; index < arr.length; index++) {
//            if (arr[index] != index+1)
//                ans.add(index+1);
//        }
//
//        return ans;
//    }
//    void swap(int[] arr, int value1, int value2){
//        int temp = arr[value1];
//        arr[value1] = arr[value2];
//        arr[value2] = temp;
//    }
//}
