package com.practice_package;

import java.util.Arrays;
import java.util.Scanner;

public class PlacementTraining05072023 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = "asdb";
        String s2 = "a";
        System.out.println(s1.compareTo(s2));
    }

    public static void primeFactorsWithCount(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                System.out.println(i + " -> " + count);
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int sumOfFactors(int n){
        int sum=0;
        for (int i=1; i<=n/2; i++) {
            if (n%i==0) sum+=i;
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        // PERFECT NUMBER => sum of factors == n
        return sumOfFactors(n) == n;
    }

    public static boolean isAmicable(int a, int b) {
        if (sumOfFactors(a) == b)
            if (sumOfFactors(b) == a)
                return true;
        return false;
    }

    public static boolean isSmooth(int a, int b) {
        int max = a;
        for (int i=(int)Math.sqrt(a); i>1; i--) {
            if (a%i==0) {
                max = i;
                break;
            }
        }
        return max<=b;
    }

    public static String onlyString(String s) {
        StringBuilder str = new StringBuilder();
        for (char c: s.toCharArray()) {
            if ( (c>'A' && c<'Z') || (c>'a' && c<'z') )
                str.append(c);
        }
        return str.toString();
    }


}
