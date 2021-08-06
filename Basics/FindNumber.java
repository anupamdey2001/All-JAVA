package com.company;

public class FindNumber {
    public static void main(String[] args) {
        int n = 131531;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 3){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
