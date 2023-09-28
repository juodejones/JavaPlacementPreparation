package com.practice_package;

import java.util.*;

public class DeltaX {

    private static final Map<Character, Integer> romanNumerals = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    static {
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
    }

    public static boolean isValidRomanNumeral(String romanNumeral) {
        for (int i = 0; i < romanNumeral.length(); i++) {
            int value = romanNumerals.get(romanNumeral.charAt(i));
            if (value == 0) return false;
            if (i + 1 < romanNumeral.length() && romanNumerals.get(romanNumeral.charAt(i + 1)) > value) {
                int nextValue = romanNumerals.get(romanNumeral.charAt(++i));
                if (value * 2 <= nextValue) return false;
            }
        }
        return true;
    }

    public static int getRomanNumeralValue(String romanNumeral) {
        int value = 0;
        for (int i=0; i < romanNumeral.length(); i++) {
            int currentValue = romanNumerals.get(romanNumeral.charAt(i));
            value += currentValue;
            if (i + 1 < romanNumeral.length() && romanNumerals.get(romanNumeral.charAt(i + 1)) > currentValue)
                value -= currentValue;
        }
        return value;
    }

    public static int countCombinations(int[] pieces, int K) {
        int count = 0;
        HashSet<String> combinations = new HashSet<>();
        Arrays.sort(pieces);
        for (int i = 0; i < pieces.length; i++) {
            int sum = pieces[i];
            String combination = pieces[i] + "";
            if (sum == K) {
                count++;
                combinations.add(combination);
            }
            for (int j = i + 1; j < pieces.length; j++) {
                sum += pieces[j];
                combination += " " + pieces[j];
                if (sum == K) {
                    if (!combinations.contains(combination)) {
                        count++;
                        combinations.add(combination);
                    }
                } else if (sum > K) {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] pieces = new int[N];

        for (int i = 0; i < N; i++) {
            pieces[i] = scanner.nextInt();
        }

        int count = 0;
        HashSet<String> combinations = new HashSet<>();
        Arrays.sort(pieces);
        for (int i = 0; i < pieces.length; i++) {
            int sum = pieces[i];
            String combination = pieces[i] + "";
            if (sum == K) {
                count++;
                combinations.add(combination);
            }
            for (int j = i + 1; j < pieces.length; j++) {
                sum += pieces[j];
                combination += " " + pieces[j];
                if (sum == K) {
                    if (!combinations.contains(combination)) {
                        count++;
                        combinations.add(combination);
                    }
                } else if (sum > K) {
                    break;
                }
            }
        }
        System.out.println(count);

        scanner.close();
    }

    private static boolean validatePhoneNumber(String phonenumber) {
        int firstDigit = phonenumber.charAt(0);
        if (firstDigit == '+' && phonenumber.substring(0,3).equals("+91")) {
            phonenumber = phonenumber.substring(3);
            if(phonenumber.indexOf(" ") != 0 && phonenumber.indexOf(" ") != 6) {
                return false;
            }
        } else if(firstDigit == '0') {
            phonenumber = phonenumber.substring(1);
        }else if (firstDigit != '7' && firstDigit != '8' && firstDigit != '9') {
            return false;
        }
        int length = phonenumber.length();
        if (length != 10) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            if (!Character.isDigit(phonenumber.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
