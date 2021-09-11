package com.company;

public class SetMismatch {
    public static void main(String[] args) {

    }
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                swap(nums, i, nums[i]);
            }else{
                i++;
            }
        }
        //Search for missing
        for(int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1)
                return new int[] {nums[index],index+1};
        }
return new int[] {-1,-1};
    }
    static void swap(int[] arr, int value1, int value2){
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }
}
