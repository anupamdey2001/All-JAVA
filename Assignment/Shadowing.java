package com.company;

public class Shadowing {
   static int x = 90;//This will be shadowed on line 7
    public static void main(String[] args) {
        System.out.println(x);//90
         int x = 40;//The Class variable at line4 is shadowed by this
        System.out.println(x);//40
        fun();//90
    }
    static void fun(){
        System.out.println(x);
    }
}
