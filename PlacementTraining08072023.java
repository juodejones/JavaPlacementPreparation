package com.practice_package;

public class PlacementTraining08072023 {

    public static void main(String[] args) {
        getGrossSalary(14000);
    }

    public static double getGrossSalary(int salary) {
        if (salary<0) return 0;
        double total = salary;
        if (salary <= 10000) total += salary;
        else if(salary <= 20000) total += salary*1.15;
        else total+=salary*1.25;
        System.out.printf("Rs.%.2f",total);
        return total;
    }

    public static int getCompletedDays(int d, int m, int y) {
          return 0;
    }
}
