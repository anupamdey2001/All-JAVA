package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);
        list.add(1000);
        list.add(1100);
        list.add(1200);
        list.add(1300);
//        System.out.println(list.contains(200));
//        System.out.println(list.set(2, 500));
        System.out.println(list);
    }
}
