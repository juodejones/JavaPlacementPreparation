package com.practice_package;

import java.io.*;
import java.util.*;

public class PlacementTraining11072023 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        isPanagram("the quick brown fox jumps over the lazy dog");
//        System.out.println((int) 'a');

    }

    public static void commonElements() {
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int[] arr1 = new int[a], arr2 = new int[b], arr3 = new int[c];
        for (int i = 0; i < a; arr1[i++] = sc.nextInt()) ;
        for (int i = 0; i < b; arr2[i++] = sc.nextInt()) ;
        for (int i = 0; i < c; arr3[i++] = sc.nextInt()) ;
        int min = Math.min(Math.min(a, b), c);
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                if (arr1[i] == arr2[j])
                    for (int k = 0; k < c; k++)
                        if (arr2[j] == arr3[k]) System.out.print(arr3[k] + " ");
    }

    public static void rotateArray(int[] arr, int n) {
        int a = arr.length;
        while (n-- != 0) {
            int t = arr[a - 1];
            for (int i = a - 1; i > 0; arr[i] = arr[i - 1], i--) ;
            arr[0] = t;
        }
        for (int i = 0; i < a; System.out.print(arr[i++] + " ")) ;
    }

    public static void pattern1(int n) {
//        1
//        1
//        1
//        1
//        22
//        22
//        333
//        4444
        int a = 1;
        while (a <= n) {
            int c = n / a;
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < a; j++) System.out.print(a);
                System.out.println();
            }
            a++;
        }
    }

    public static void pattern2(int n) {
        for (int i = 1, c = 0, a = 1; i <= n; a++) {
            System.out.print(i);
            if (a == i) {
                System.out.println();
                a = 0;
                c++;
            }
            if (c == (n / i)) {
                c = 0;
                i++;
            }
        }
    }

    public static void pattern3(int n) {
//        1
//        1
//        1
//        1
//        2 2 2
//        2 2 2
//        2 2 2
//        3 3 3 3 3
//        3 3 3 3 3
//        4 4 4 4 4 4 4
        for (int x = 1, i = 1; x <= n; x++, i += 2) {
            for (int k = 0; k < n - x + 1; k++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }

    public static void descCount(int[] arr) {
        int n = arr.length;
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            if (count[i] != -1) {
                int c = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        c++;
                        count[j] = -1;
                    }
                }
                count[i] = c;
//                System.out.println("\'" + arr[i] + "\' -> " + c);
            }
        }
        int size = count.length;
        int t;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (count[i] < count[j]) {
                    t = count[i];
                    count[i] = count[j];
                    count[j] = t;
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        t = 0;
        n = count[t];
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[t] + " ");
            }
            n = count[++t];
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (new String(a1).equals(new String(a2))) {
            System.out.printf("%s and %s are Anagrams", s1, s2);
            return true;
        } else System.out.printf("%s and %s are Not Anagrams", s1, s2);
        return false;
    }

    public static void isPanagram(String s) {
//        int sum = 2847; // sum of ascii values from 'a' to 'z'
        Set<Character> set = new HashSet<>();
        for(char c: s.toLowerCase().toCharArray())
            if (c > 96 && c < 123) set.add(c);
        if (set.size() == 26) System.out.println("Panagram");
        else System.out.println("Not a Panagram");
//        if (s.length() > 25)
//            for (char c : set)
//                if (c > 96 && c < 123) sum -= c;
//        if (sum > 0) System.out.println("Not a Panagram");
//        else System.out.println("Panagram");
    }
}
