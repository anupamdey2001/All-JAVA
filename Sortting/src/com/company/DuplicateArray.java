package com.company;

import java.util.ArrayList;
import java.util.List;

public class DuplicateArray {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    i++;
                }
        }

        for (int index = 0;index < nums.length; index++){
            if (nums[index] != index+1)
                ans.add(nums[index]);
        }

        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
