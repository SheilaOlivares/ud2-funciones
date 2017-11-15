package com.company;

public class Main {

    public static int factorialIterativo(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
        r *= i;
        }
        return r;
    }

    public static int factorialRecursivo (int n){
        if ( n > 0){
           return factorialIterativo(n-1)*n;
        }else{
            return 1;
        }

    }

    public static void main(String[] args) {

        System.out.println(factorialIterativo(5));
        System.out.println(factorialRecursivo(5));

    }
}
