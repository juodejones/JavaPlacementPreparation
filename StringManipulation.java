package com.practice_package;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        System.out.println(printPermutation("eating", ""));
    }
    public static String reverseOnlyLetters(char[] arr) {
        char[] rev = new char[arr.length];
        int i,k=0;
        char temp;
        for(char ch : arr) if(Character.isAlphabetic(ch)) rev[k++] = ch;
        for (i=0; i<k/2; i++) {
            temp = rev[i];
            rev[i] = rev[k-i-1];
            rev[k-i-1] = temp;
        }
        for (i=0,k=0; i<arr.length; i++) if(Character.isAlphabetic(arr[i])) arr[i]=rev[k++];
        return new String(arr);
    }

    public static int countPalindromes(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 3; j <= str.length(); j++) {
                if (isPalindrome(str.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }


    public static String largestConsecutiveVowel(String input) {
        int maxCount = 0;
        int count = 0;
        int endIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    endIndex = i;
                }
            } else {
                count = 0;
            }
        }
        int startIndex = endIndex - maxCount + 1;
        return input.substring(startIndex, endIndex + 1);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean checkPolydorm(String str) {
        int n = str.length();
        for(int i=0,k=0; i<n; i+=6,k++) {
            if (k%2==0)
                if(!poly1(str.substring(i,i+6)))
                    return false;
            else
                if (!poly2(str.substring(i,i+6)))
                    return false;
        }
        return true;
    }

    public static boolean poly1(String str) {
        if(str.charAt(0)!=str.charAt(3) || str.charAt(1)!=str.charAt(4) || str.charAt(2)!=str.charAt(5))
            return false;
        return true;
    }

    public static boolean poly2(String str) {
        if(str.charAt(0)!=str.charAt(5) || str.charAt(1)!=str.charAt(4) || str.charAt(2)!=str.charAt(3))
            return false;
        return true;
    }

    public static void balancingParentheses(String s) {
        char[] str=s.toCharArray();
        int len=s.length()-1,open=0,close=0;
        for(int start=0,end=len;start<=len;start++,end--) {
            if(str[start]=='(')
                open++;
            else if(str[start]==')')
                open--;
            if(str[end]==')')
                close++;
            else if(str[end]=='(')
                close--;
            if(open<0) {
                str[start]=(char)-1;
                open=0;
            }
            if(close<0) {
                str[end]=(char)-1;
                close=0;
            }

        }
        for(char ch:str) {
            if(ch!=(char)-1)
                System.out.print(ch);
        }

    }

    public static void countOccurrence(String str) {
        int n = str.length();
        int count = 0;
        int[] countArr = new int[n];
        char[] arr = str.toCharArray();
        for (int i=0; i<n; i++) {
            if(countArr[i]!=-1) {
                int c=1;
                for (int j=i+1; j<n; j++) {
                    if (arr[i]==arr[j]){
                        c++;
                        countArr[j]=-1;
                    }
                }
                countArr[i]=c;
                System.out.println("\'" + arr[i] + "\' -> " + c);
            }
        }
        for (int i=0; i<n; i++) {
            if (countArr[i]>1) count++;
        }
        System.out.println(count);
    }

    public static void longestCommonSubstring(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] arr = new int[len1][len2];
        int endPos = 0,startPos=0;
        for(int i=0; i<len1; i++) {
            for (int j=0; j<len2; j++) {
                if (s1.charAt(i)==s2.charAt(j)) {
                    if (i==0||j==0) {
                        arr[i][j]=1;
                    } else {
                        arr[i][j] = arr[i-1][j-1]+1;
                        if (arr[i][j]>endPos) {
                            endPos = arr[i][j];
                            startPos = j+1;
                        }
                    }
                }
            }
        }
//        for(int i=0; i<len1; i++) {
//            for (int j=0; j<len2; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(s2.substring(startPos-endPos,startPos));
    }

    public static Set<String> printPermutation(String str, String ans)
    {
        Set<String> set = new HashSet<>();
        if (str.length() == 0) {
//            System.out.print(ans + " ");
            set.add(ans);
            return set;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            set.addAll(printPermutation(ros, ans + ch));
        }
        return set;
    }
}
