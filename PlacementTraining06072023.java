package com.practice_package;

import java.util.Scanner;

public class PlacementTraining06072023 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern1(int a, int n) {
//        66666
//        65555
//        65444
//        65433
//        65432
        for (int r = 0; r < n; r++) {
            for (int c = 0; c <= r; c++)
                System.out.print(a - c);
            for (int c = r + 1; c < n; c++)
                System.out.print(a - r);
            System.out.println();
        }
    }

    public static void pattern2(int n) {
//        01 02 03 04 05
//        10 09 08 07 06
//        11 12 13 14 15
//        20 19 18 17 16
//        21 22 23 24 25
        for (int r = 0; r < n; r++) {
            if (r % 2 == 0) {
                int s = r * n + 1;
                for (int c = s; c < s + n; c++)
                    System.out.printf("%02d ", c);
            } else {
                int s = (r + 1) * n;
                for (int c = s; c > s - n; c--)
                    System.out.printf("%02d ", c);
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
//        1
//        2  3
//        4  5  6
//        7  8  9 10
//        11 12 13 14 15
        int t = 1;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c <= r; c++)
                System.out.printf("%-3d", t++);
            System.out.println();
        }
    }

    public static void pattern4(int n) {
//        01*02*03*04*05
//        11*12*13*14*15
//        21*22*23*24*25
//        31*32*33*34*35
//        41*42*43*44*45
        for (int r = 0; r < n * 2; r++) {
            int c;
            for (c = r * n + 1; c % n != 0; c++)
                System.out.printf("%02d*", c);
            System.out.printf("%02d\n", c);
            r++;
        }
    }

    public static void pattern5(int n) {
//        55555
//        55155
//        55255
//        55355
//        55555
        for (int r=0; r<n; r++,System.out.println()) {
            for (int c=0; c<n; c++) {
                if (c==n/2 && r!=0 && r!=n-1)
                    System.out.print(r);
                else
                    System.out.print(n);
            }
        }
    }

    public static void pattern6(int n) {
//        12345
//        21234
//        32123
//        43212
//        54321
        for (int r=1; r<=n; r++) {
            for (int c=0; c<r; c++)
                System.out.print(r-c);
            for (int c=r; c<n; c++) {
                System.out.print(c-r+2);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
//        1       1
//        12     21
//        123   321
//        1234 4321
//        123454321
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=r; c++)
                System.out.print((c==5)?"":c);
            for (int c=2*(r+1); c<=n*2; c++)
                System.out.print(" ");
            for (int c=r; c>0; c--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
//        55555
//        54444
//        54333
//        54322
//        54321
        for(int r = 0; r<n; r++) {
            for (int c = 0; c <= r; c++) {
                System.out.print(n - c);
            }
            for (int c = r+1; c < n; c++) {
                System.out.print(n - r);
            }
            System.out.println();
        }
    }

    public static void currency(int amt) {
        System.out.println("Total number of notes: ");
        System.out.println("500: " + amt / 500);
        amt %= 500;
        System.out.println("100: " + amt / 100);
        amt %= 100;
        System.out.println("50: " + amt / 50);
        amt %= 50;
        System.out.println("20: " + amt / 20);
        amt %= 20;
        System.out.println("10: " + amt / 10);
        amt %= 10;
        System.out.println("5: " + amt / 5);
        amt %= 5;
        System.out.println("2: " + amt / 2);
        amt %= 2;
        System.out.println("1: " + amt);
    }

    public static int trailingZerosInFactorial(int n) {
        int c;
        for (c = 0; n > 4; c += n / 5, n /= 5) ;
        return c;
    }

    public static boolean isUgly(int n) {
//        Ugly number is a number which has no prime factors other than 2,3,5
        for (int i = 7; i * i < n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int sumOfFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isBetrothed(int a, int b) {
        if (sumOfFactors(a) == b + 1 || sumOfFactors(b) == a + 1)
            return true;
        return false;
    }

    public static void primesInRange(int a, int b) {
        if (a <= 2) {
            if (a == 2)
                a += 1;
            System.out.print(2);
        }
        for (int i = a; i < b; i += 2) {
            if (isPrime(i)) {
                System.out.print("," + i);
            }
        }
    }


    public static boolean isPrime(int n) {
        for (int i = 3; i * i < n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isAmicable(int a, int b) {
        return (sumOfFactors(a) == b && sumOfFactors(b) == a);
    }

    public static void amicablePairs(int a, int b) {
        for (int i = a; i < b; i++) {
            int sum = sumOfFactors(i);
            if (i == sumOfFactors(sum) && i < sum)
                System.out.println(i + " " + sum);
        }
    }

    public static boolean isArmstrong(int n) {
        int sum = 0, t = n, o = length(n);
        while (t != 0) {
            int d = t % 10;
            sum += power(d, o);
            t /= 10;
        }
        // System.out.print(sum);
        return sum == n;
    }

    public static int length(int n) {
        int x = 0;
        while (n != 0) {
            x++;
            n = n / 10;
        }
        return x;
    }

    public static int power(int a, int b) {
        int n, i;
        for (i = 1, n = a; i < b; i++, n = n * a) ;
        return n;
    }

    public static void armstrongInRange(int a, int b) {
        if (b < 9) {
            for (int i = 1; i <= b; i++, System.out.print(i + " ")) ;
            return;
        }
        for (int i = 1; i < 10; System.out.print(i++ + " ")) ;
        for (int i = 10; i <= b; i++)
            if (isArmstrong(i)) System.out.print(i + " ");
    }

    public static void betrothedPairs(int a, int b) {
        for (int i = a; i < b; i++) {
            int sum = sumOfFactors(i) - 1;
            if (i == sumOfFactors(sum) - 1 && i < sum)
                System.out.println(i + "," + sum);
        }
    }

    public static boolean isKaprekar(int s) {
        int n = s*s;
        int l = length(n) / 2;
        int d = power(10, l);
        if (s == ((n % d) + (n / d))) {
            return true;
        }
        if (n % 2 != 0) {
            d = power(10, l + 1);
            return s == ((n % d) + (n / d));
        }
        return false;
    }

    public static int sumOfDigits(int n) {
        int s;
        for (s=0;n!=0;s+=n%10,n/=10);
        return s;
    }

    public static boolean isHarshadNum(int n) {
        return (n%sumOfDigits(n)==0);
    }

    public static int getCount(int n, int d) {
        int c=0;
        while (n!=0) {
            if (n % 10 == d) c++;
            n/=10;
        }
        return c;
    }

    public static void frequencyOfDigits(int n) {
        for (int i=0; i<10; i++) {
            System.out.println(i + " occurs " + getCount(n,i) + " times");
        }
    }

    public static int rotateLeft(int n, int r) {
        int c = power(10,length(n)-1);
        for (int i = 0; i <r; i++) {
            n = (n%c)*10 + n/c;
        }
        return n;
    }

    public static int rotateRight(int n, int r) {
        int c = power(10,length(n)-1);
        for (int i = 0; i <r; i++) {
            n = (n%10)*c + n/10;
        }
        return n;
    }

    public static int reverse(int n) {
        int r;
        for (r=0; n!=0; r=r*10+n%10, n/=10) ;
        return r;
    }

    public static boolean isMagical(int s) {
        int n = sumOfDigits(s);
        while (n>=10) {
            n = sumOfDigits(n);
        }
        return n==1;
    }

    public static boolean pdtSum(int n) {
        int pdt=1, sum=0;
        if(length(n)%2!=0){
            sum+=n%10;
            n/=10;
        }
        for (int t=n; t!=0; pdt*=t%10,t/=100);
        for (n/=10; n!=0; sum+=n%10,n/=100);
        return pdt%sum==0;
    }

    public static String decToHexa(int n) {
        return Integer.toString(n,16);
    }

    public static int leftMostDivisor(int n) {
        int div=1;
        while (n!=0) {
            int d = n%10;
            if (n%d==0) div=d;
            n/=10;
        }
        return div;
    }

    public static int swapDigits(int n, int a, int b) {
        int l = length(n);
        n = reverse(n);
        int r = 0,t,x=0,y=0,i;
        for (i=1,t=n; i<=l; i++,t/=10) {
            if (i==a) {
                x=t%10;
            } else if(i==b) {
                y=t%10;
                break;
            }
        }
        for (i=1,t=n; i<=l; i++, t/=10) {
            if (i==a)
                r=r*10+y;
            else if(i==b)
                r=r*10+x;
            else
                r=r*10+t%10;
        }
        return r;
    }
}
