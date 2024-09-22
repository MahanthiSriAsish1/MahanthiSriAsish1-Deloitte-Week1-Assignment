package com.deloitte.lab3ex9;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Lab3Ex9 {
	public static void getDayMonthYear(String date) {
        LocalDate currentDate = LocalDate.parse(date);
        int day = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();
        int year = currentDate.getYear();

        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }

    public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in the format YYYY-MM-DD:");
        String date = scanner.nextLine();
        getDayMonthYear(date);
        
        scanner.close();
    }

}
