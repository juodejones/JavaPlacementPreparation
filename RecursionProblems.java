package com.practice_package;

public class RecursionProblems {
    public static void main(String[] args) {
        int n = 6,i;
        String hel = "hello";
        for (i=0, System.out.println(""); i<n ; System.out.println(i++));
    }

    public static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }
}
