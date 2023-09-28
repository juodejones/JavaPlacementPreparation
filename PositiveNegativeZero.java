package com.practice_package;

public class PositiveNegativeZero {

    public static void main (String[] args){
        System.out.print(String.format("%15s", "Format").replace(" ", "$"));
    }

    public static void checkNumber(int number) {
        if (number > 0)
            System.out.println(number + " is Positive");
        else if (number < 0)
            System.out.println(number + " is Negative");
        else
            System.out.println(number + " is Zero");
    }
}
