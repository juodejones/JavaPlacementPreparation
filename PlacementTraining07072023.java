package com.practice_package;

public class PlacementTraining07072023 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.concat(" World"));
    }

    public static void twoDigitsInRange(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i == 100) break;
        }
    }

    public static void except4(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 4) continue;
            System.out.print(i + " ");
        }
    }

    public static void upto16(int n) {
        for (int i = n; i < 16; i++) {
            System.out.print(i + " ");
        }
    }

    public static void quadrant(int a, int b) {
        if (a > 0 && b > 0) {
            System.out.println("Point lies in the First quadrant");
        } else if (a < 0) {
            if (b < 0)
                System.out.println("Point lies in the Third quadrant");
            else
                System.out.println("Point lies in the Second quadrant");
        } else {
            System.out.println("Point lies in the Fourth quadrant");
        }
    }

    public static void typeOfTriangle(int a, int b, int c) {
        if (a == 90 || b == 90 || c == 90) {
            System.out.print("Right angled triangle");
        } else if (a == b) {
            if (b == c)
                System.out.print("Equilateral triangle");
        } else if (a == c || b == c) {
            System.out.print("Isosceles triangle");
        } else {
            System.out.print("Scalar triangle");
        }
    }

    public static void typeOfAngle(int a) {
        if(a<0) a=360+a;
        if (a<90) System.out.print("Acute angle");
        if (a==90) System.out.print("Right angle");
        if (a>90 && a<180) System.out.print("Obtuse angle");
        if (a==180) System.out.print("Linear angle");
        if (a>180) System.out.print("Reflex angle");
        if (a==360) System.out.print("Full rotated angle");
    }

    public static void nothing(String[] s1, String[] s2) {

    }

}
