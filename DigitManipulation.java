package com.practice_package;

import java.util.LinkedList;
import java.util.Scanner;

public class DigitManipulation {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int count(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int countWithoutLoop(int n) {
        return (n == 0) ? 1 : (int) Math.log10(n) + 1;
    }
    public static int printEvenOnly(int n) {
        int r = 0;
        for (; n != 0; n /= 10) {
            if (n % 2 == 0) r = r * 10 + n % 10;
        }
        System.out.println(r);
        return r;
    }
    public static int reverse(int n) {
        int r=0;
//        for (r=0; n!=0; r=r*10+n%10, n/=10) ;
        while(n>0) {
            r = r*10 + n%10;
            n = n/10;
        }
        return r;
    }

    public static boolean isPalindrome(int n) {
        int t = n;
        int r=0;
        while(t>0) {
            r = r*10 + t%10;
            t = t/10;
        }
        return n==r;
    }
    public static void primesDigitsOnly(int n) {
        for (int d=n%10; n!=0; n/=10,d=n%10) {
            if (d==2 || d==3 || d==5 || d==7)
                System.out.print(d);
        }
    }
    public static int trailingZeroInFactorial(int n){
        int c;
//        for(f=1;n>0;f*=n,n--);
//        for(c=0;f%10==0;c++,f/=10);
//        The above will not work from n=20
//        since the factorial value cannot be
//        holded in any dataType in java

        for(c=0; n>4; c+=n/5,n/=5);
        return c;
    }

    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return false;
        StringBuilder sb = new StringBuilder();
        for(char c: s.toLowerCase().toCharArray()) {
            if((c>='0' && c<='9') || (c>='a' && c<='z')) sb.append(c);
        }
        String str=sb.toString();
        System.out.println(str);
        s = sb.reverse().toString();
        System.out.println(s);
        return (s.equals(str));

    }
}
