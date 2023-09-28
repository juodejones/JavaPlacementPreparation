package com.practice_package;

public class StructuralPatterns {
    public static void main(String[] args) {
    }

    public static void pattern1(int n) {
//    *
//    **
//    ***
//    ****
//    *****
        for(int r = 0; r<n; r++) {
            for (int c = 0; c<=r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
//    *****
//    ****
//    ***
//    **
//    *
        for(int r = 0; r<n; r++) {
            for (int c = r; c<n; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
//    *****
//    ****
//    ***
//    **
//    *
//
//    *
//    **
//    ***
//    ****
//    *****
        for(int r = 0; r<n; r++) {
            for (int c = r; c<n; c++) {
                System.out.print("*");
            }
        }
        System.out.println();
        for(int r = 0; r<n; r++) {
            for (int c = 0; c<=r; c++) {
                System.out.print("*");
            }
        }
    }
    public static void pattern4(int n) {
//        *
//       **
//      ***
//     ****
//    *****
        for (int r=0; r<n; r++){
            for (int c=r+1; c<n; c++)
                System.out.print(" ");
            for (int c=0; c<=r;c++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void pattern5(int n) {
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
        for (int r=0; r<n; r++){
            for (int c=r+1; c<n; c++)
                System.out.print(" ");
            for (int c=0; c<=r;c++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern6(int n) {
//    *****
//     ****
//      ***
//       **
//        *
        for (int r=0; r<n; r++){
            for (int c=0; c<r; c++)
                System.out.print(" ");
            for (int c=r; c<n; c++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void pattern7(int n) {
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
        for (int r=0; r<n; r++){
            for (int c=0; c<r; c++)
                System.out.print(" ");
            for (int c=r; c<n; c++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern8(int n) {
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
        for (int r=0; r<n; r++){
            for (int c=0; c<r; c++)
                System.out.print(" ");
            for (int c=r; c<n; c++)
                System.out.print("* ");
            System.out.println();
        }
        for (int r=0; r<n; r++){
            for (int c=r+1; c<n; c++)
                System.out.print(" ");
            for (int c=0; c<=r;c++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern9(int n) {
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
        for (int r=0; r<n; r++){
            for (int c=r+1; c<n; c++)
                System.out.print(" ");
            for (int c=0; c<=r;c++)
                System.out.print("* ");
            System.out.println();
        }
        for (int r=1; r<n; r++){
            for (int c=0; c<r; c++)
                System.out.print(" ");
            for (int c=r; c<n; c++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern10(int n) {
//    *
//    ***
//    *****
//    *******
//    *********
        for(int r = 1; r<n*2; r+=2) {
            for (int c = 0; c<r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n) {
//    *********
//    *******
//    *****
//    ***
//    *

        for(int r = 1; r<n*2; r+=2) {
            for (int c = r; c < n * 2; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern12(int n) {
//        *
//       ***
//      *****
//     *******
//    *********
        for(int r = 1; r<n*2; r+=2) {
            for(int c=r+1; c<n*2; c+=2)
                System.out.print(" ");
            for (int c = 0; c<r; c++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void pattern13(int n) {
//    *********
//     *******
//      *****
//       ***
//        *

        for(int r = 1; r<n*2; r+=2) {
            for (int c=1; c<r; c+=2)
                System.out.print(" ");
            for (int c = r; c < n * 2; c++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void pattern14(int n) {
//        *
//       ***
//      *****
//     *******
//    *********
//     *******
//      *****
//       ***
//        *

        for(int r = 1; r<n*2; r+=2) {
            for(int c=r+1; c<n*2; c+=2)
                System.out.print(" ");
            for (int c = 0; c<r; c++)
                System.out.print("*");
            System.out.println();
        }
        for(int r = 2; r<n*2; r+=2) {
            for (int c=1; c<r; c+=2)
                System.out.print(" ");
            for (int c = r+1; c<n*2; c++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void pattern15(int n) {
//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
        for(int r = 1; r<n*2; r+=2) {
            for (int c=r+1; c<n*2; c++)
                System.out.print(" ");
            for (int c = 0; c<r; c++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern16(int n) {
//    * * * * * * * * *
//      * * * * * * *
//        * * * * *
//          * * *
//            *

        for (int r = 1; r < n * 2; r += 2) {
            for (int c=0; c<r; c++)
                System.out.print(" ");
            for (int c = r; c < n * 2; c++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern17(int n) {
//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
//      * * * * * * *
//        * * * * *
//          * * *
//            *
        for(int r = 1; r<n*2; r+=2) {
            for (int c=r+1; c<n*2; c++)
                System.out.print(" ");
            for (int c = 0; c<r; c++)
                System.out.print("* ");
            System.out.println();
        }
        for (int r = 3; r < n * 2; r += 2) {
            for (int c=1; c<r; c++)
                System.out.print(" ");
            for (int c = r; c < n * 2; c++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void pattern18(int n) {
//    *****
//    *   *
//    *   *
//    *   *
//    *****
        for(int r=0; r<n; r++) {
            for (int c = 0; c < n; c++) {
                if (r == 0 || c == 0 || r == n - 1 || c == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
