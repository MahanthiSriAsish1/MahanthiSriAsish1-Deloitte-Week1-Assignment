package com.deloitte.lab1ex5;

import java.util.Scanner;

public class Lab1Ex5 {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Natural Numbers:");
        int n = sc.nextInt();

        int sum = calculateSum(n);

        System.out.println(sum);
        sc.close();
    }
}
