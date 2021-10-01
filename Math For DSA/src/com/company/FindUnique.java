package com.company;

public class FindUnique {
    public static void main(String[] args) {
     int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int uniqueNum = 0;
        for (int n : arr) {
            uniqueNum ^= n;

        }
        return uniqueNum;
    }
}
