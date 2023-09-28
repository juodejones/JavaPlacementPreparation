package com.practice_package;

public class GridPatterns {

    public static void main(String[] args) {
        pattern1(5);
    }

    public static void pattern1(int n) {
        for(int r=0; r<n; r++) {
            for (int c = 0; c < n; c++) {
                if (r == 0 || c == 0 || r == n-1 || c == n-1)
                    System.out.print("*");
                else if (r==c || r+c==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
