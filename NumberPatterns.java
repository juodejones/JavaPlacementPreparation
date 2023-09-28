package com.practice_package;

import java.util.regex.Pattern;

public class NumberPatterns {
    public static void main(String[] args) {
//        5 5555555 5
//        54 44444 45
//        543 333 345
//        5432 2 2345
//        5432 1 2345

//        5432 2 2345
//        543 333 345
//        54 44444 45
//        5 5555555 5

        int r,c, n=5;
        for (r=0; r<n; r++) {
            for(c=0; c<=r; c++) {
                System.out.print(n-c);
            }
            System.out.println();
            for (c=0; c<2*(n-r-2); c++) {
                System.out.print(n-r);
            }
        }
    }

    public static void pattern1(int n) {
//        11111
//        22222
//        33333
//        44444
//        55555
        for (int r = 0; r < n; r++, System.out.println())
            for (int c = 0; c < n; c++)
                System.out.print(r + 1);
    }
    public static void pattern2(int n) {
//        12345
//        12345
//        12345
//        12345
//        12345
        for (int r = 0; r < n; r++, System.out.println())
            for (int c = 0; c < n; c++)
                System.out.print(c + 1);
    }
    public static void pattern3(int n) {
//        1
//        22
//        333
//        4444
//        55555
        for (int r = 0; r < n; r++, System.out.println())
            for (int c = 0; c <= r; c++)
                System.out.print(r + 1);
    }
    public static void pattern4(int n) {
//        1
//        23
//        456
//        78910
//        1112131415
        int t = 1;
        for (int r = 0; r < n; r++, System.out.println())
            for (int c = 0; c <= r; c++)
                System.out.print(t++);
    }
    public static void pattern5(int n) {
//        1
//        24
//        135
//        2468
//        13579
        for (int r = 1; r <= n; r++, System.out.println()) {
            int s = (r % 2 == 0) ? 2 : 1;
            for (int c = s; c <= r * 2; c += 2) {
                System.out.print(c);
            }
        }
    }

    public static void pattern6(int n) {
//        54321
//        5432
//        543
//        54
//        5
        for (int r = 0; r < n; r++, System.out.println())
            for (int c = n; c > r; c--)
                System.out.print(c);
    }
    public static void pattern7(int n) {
//        1
//        11
//        21
//        1211
//        111221
        String t = "1";
        System.out.println(t);
        for (int r = 1; r < n; r++) {
            t = getNum(t);
            System.out.println(t);
        }
    }
    public static String getNum(String s) {
//        Input: 1211
//        Output: 111221

        int count = 1, n = s.length();
        StringBuilder res = new StringBuilder();

        if (n < count) return count + s;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (i < n - 1 && s.charAt(i + 1) == c) {
                count++;
            } else {
                res.append(count);
                res.append(c);
                count = 1;
            }
        }

        return res.toString();
    }
    public static void pattern8(int n) {
//        5 5555555 5
//        54 44444 45
//        543 333 345
//        5432 2 2345
//        5432 1 2345
//        5432 2 2345
//        543 333 345
//        54 44444 45
//        5 5555555 5

        for(int r = 0; r<n; r++) {
            for (int c = 0; c<=r; c++) {
                System.out.print(n-c);
            }
//            System.out.print(" ");
            for (int c = r-1; c<=n-r; c++) {
                System.out.print(n-r);
            }
//            System.out.print(" ");
            for (int c = n-r; c<=n; c++) {
                if(c==1) continue;
                System.out.print(c);
            }
            System.out.println();
        }
        for(int r = 1; r<n; r++) {
            for (int c = 0; c<n-r; c++) {
                System.out.print(n-c);
            }
//            System.out.print(" ");
            for (int c = 1; c<2*r; c++) {
                System.out.print(r+1);
            }
//            System.out.print(" ");
            for (int c = r; c<n; c++) {
                System.out.print(c+1);
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
//        5 5555555 5
//        54 44444 45
//        543 333 345
//        5432 2 2345
//        5432 1 2345
//        5432 2 2345
//        543 333 345
//        54 44444 45
//        5 5555555 5
        for (int r = 1 - n; r < n; r++) {
            for (int c = 1 - n; c < n; c++) {
                if (Math.abs(c) > Math.abs(r))
                    System.out.print(Math.abs(c) + 1);
                else
                    System.out.print(Math.abs(r) + 1);
            }
            System.out.println();
        }
    }

    private static int mod(int n) {
        if(n<0) return -n;
        return n;
    }
}