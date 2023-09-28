package com.practice_package;

public class PlacementTraining040723 {

//    static {
//        int a = 20;
//        int b = 10;
//        System.out.println(a + " " + b);
//    }

    public static void main(String[] args) {
        exponentialForm(1234.567f);
    }

    public static int getAscii(char c) {
        System.out.println(c + ":" + (int) c);
        return (int) c;
    }

    public static char getChar(int n) {
        if (n < 65 || n > 122 || (n > 90 && n < 97)) {
            System.out.println("Invalid input");
            return ' ';
        }
        System.out.println(n + ":" + (char) n);
        return (char) n;
    }

    public static void print15Spaces(int n1, int n2) {
        System.out.printf("%d%15d", n1, n2);
    }

    public static void roundOff2(float n) {
        System.out.printf("%.2f", n);
    }

    public static void roundOff(float f) {
        System.out.printf("%.0f", f);
    }

    public static int intoBase10(String s) {
        int n;
        if (s.charAt(0) == '0') {
            if (s.charAt(1) == 'x')
                n = Integer.parseInt(s.substring(2), 16);
            else
                n = Integer.parseInt(s, 8);
        } else {
            n = Integer.parseInt(s);
        }
        System.out.println(n);
        return n;
    }

    public static void exponentialForm(float f) {
        System.out.printf("%e",f);
    }

    public static float roundOff20_4(float n) {
        System.out.printf("%20.4f", n);
        return Float.parseFloat(String.format("%20.4f", n));
    }

    public static void preciseFloat(float n, int p) {
        String format = "%." + p + "f";
        System.out.printf(format, n);
    }

    public static int max(int n1, int n2) {
        int max = (n1 > n2) ? n1 : n2;
        System.out.println("Maximum of " + n1 + " and " + n2 + " is " + max);
        return max;
    }

    public static int min(int n1, int n2) {
        int min = (n1 < n2) ? n1 : n2;
        System.out.println("Maximum of " + n1 + " and " + n2 + " is " + min);
        return min;
    }

    public static boolean passOrFail(int mark) {
        if (mark < 35) {
            System.out.println("Fail");
            return false;
        }
        System.out.println("Pass");
        return true;
    }

    public static char getGrade(int mark) {
        char g;
        if (mark > 90) g = 'A';
        else if (mark > 75) g = 'B';
        else if (mark > 60) g = 'C';
        else g = 'D';
        System.out.println("Grade" + g);
        return g;
    }

    public static void arrange(int n1, int n2, int n3) {
        int max = max(n1, max(n2,n3));
        int min = min(n1, min(n2,n3));
        System.out.printf("%d < %d < %d", min,(n1+n2+n3-min-max), max);
    }

    public static int max(int n1, int n2, int n3) {
        int max = max(n1, max(n2,n3));
        System.out.println("Largest " + " is " + max);
        return max;
    }

    public static int min(int n1, int n2, int n3) {
        int min = min(n1, min(n2,n3));
        System.out.println("Smallest " + " is " + min);
        return min;
    }

    public static int max(int n1, int n2, int n3, int n4) {
        int max = max(max(n1,n2), max(n3,n4));
        System.out.println("Largest " + " is " + max);
        return max;
    }

    public static void arrangeDesc(int n1, int n2, int n3, int n4) {
        int max = max(max(n1,n2), max(n3,n4));
        int min = min(min(n1,n2), min(n3,n4));
        int mid1 = max(min(n1,n2), min(n3,n4));
        int mid2 = min(max(n1,n2), max(n3,n4));
        System.out.printf("%d > %d > %d > %d", max,mid2,mid1,min);
    }

    public static boolean validTriangle(int a, int b, int c) {
        if (((a+b)>c) && ((a+c)>b) && ((b+c)>a)) {
            System.out.println("Valid");
            return true;
        }
        System.out.println("Invalid");
        return false;
    }
}
