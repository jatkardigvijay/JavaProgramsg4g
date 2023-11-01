package com.jbd.basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int year;
		System.out.print("Enter a year : ");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		input.close();
		checkWhetherLeapYear(year);
	}

	private static void checkWhetherLeapYear(int year) {

		if (year % 4 == 0) {
			
			if (year % 400 == 0) {
				System.out.println("Enter year " + year + " is a leap year");
			} else if (year % 100 == 0) {
				System.out.println("Enter year " + year + " is not a leap year");
			} else {
				System.out.println("Enter year " + year + " is a leap year");
			}
			
		} else {
			System.out.println("Enter year " + year + " is not a leap year");
		}
	}
}
