package com.company;

import java.util.ArrayList;

class Union {
    public static void main(String[] args) {

    }
//    static ArrayList<Integer> doIntersection(int[] a, int[] b)
//    {
//        int i = 0;
//        int j = 0;
//        ArrayList<Integer> list=new ArrayList<>();
//        while(i< a.length || j < b.length){
//            if(a[i] != b[j]){
//                list.add(a[i]);
//            }
//            i++;
//            j++;
//        }
//        return list;
//    }
    static int union(int[] a, int[] b){
        return Math.max(a.length, b.length);
    }
}