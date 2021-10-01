package com.company;

public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        seive(primes,n);
    }
    //False in array means number is Prime
    static void seive(boolean[] primes, int n){
        for (int i = 2; i*i <= n ; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i])
                System.out.print(i + " ");
        }
    }
}
//IntStream.iterate(2, i -> i * i <= n, i -> i + 1).filter(i -> !primes[i]).flatMap(i -> IntStream.rangeClosed(i * 2, n)).forEach(j -> primes[j] = true);