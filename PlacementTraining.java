package com.practice_package;

import java.util.*;

public class PlacementTraining {

    /*
    Hello world program without using ;
    int main() {
        if(printf("Hello world")) {
        }
        return 0;
    }

    printf("%d", printf("hello"));
    OUTPUT :  -- hello5 // 5 is the length of hello

    int n=9;
    printf("%d", printf("%d", n++));
    OUTPUT : 91

    char str[100];
    int n;
    scanf("%d%n", str, &n);
    printf("%d", n);
    OUTPUT : n->length of the string
     */

    public static void main(String[] args) {
        alternateSorting(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public static String nThNumber(int n) {
        // return the n-th number for a number system with only 3s and 4s
        List<String> numbers = new ArrayList<>();
        numbers.add("3");
        numbers.add("4");
        int count = 2;

        while (count<n) {
            for (int i = 0; i < numbers.size(); i++) {
                String num = numbers.get(i);
                numbers.add(num + 3);
                numbers.add(num + 4);
                count += 2;
                if(n<=count) break;
            }
        }

        return numbers.get(n-1);
    }

    public static void printPrimes(int n) {
        if (n < 2) return;
        System.out.print(2);
        for (int i = 3; i <= n; i += 2)
            if (isPrime(i))
                System.out.print("," + i);
    }
    private static boolean isPrime(int n) {
        for (int i = 2; i*i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void denominations(int n) {
        System.out.print("Total number of notes:\n");
        System.out.printf("500 : %d\n", n/500);
        n=n%500;
        System.out.printf("100 : %d\n", n/100);
        n=n%100;
        System.out.printf("50 : %d\n", n/50);
        n=n%50;
        System.out.printf("20 : %d\n", n/20);
        n=n%20;
        System.out.printf("10 : %d\n", n/10);
        n=n%10;
        System.out.printf("5 : %d\n", n/5);
        n=n%5;
        System.out.printf("2 : %d\n", n/2);
        n=n%2;
        System.out.printf("1 : %d", n);
    }

    public static void monotonic() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; arr.add(sc.nextInt()),i++);
        List<Integer> temp = arr;
        Collections.sort(temp);
        if(temp.equals(arr)) {
            System.out.print("Monotonic");
            return;
        }
        Collections.reverse(temp);
        if(temp.equals(arr)) {
            System.out.print("Monotonic");
        } else {
            System.out.println("Not Monotonic");
        }

    }

    public static void alternateSorting(int[] arr) {
        // Alternate sorting: Given an array of integers, rearrange the array in such a way that the first
        //element is first maximum and second element is first minimum.
        //Input : {1, 2, 3, 4, 5, 6, 7}
        //Output : {7, 1, 6, 2, 5, 3, 4}
        int n = arr.length;
        int i=0, temp;
        while (i<n) {
            temp = arr[n-1];
            for(int j=n-1; j>i; arr[j]=arr[j-1],j--);
            arr[i] = temp;
            i += 2;
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }




}
