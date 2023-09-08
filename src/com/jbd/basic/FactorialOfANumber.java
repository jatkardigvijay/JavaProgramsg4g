package com.jbd.basic;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {

		int number, factorial = 1, temp;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = input.nextInt();
		input.close();
		temp = number;
		while (number > 0) {

			factorial = factorial * number;
			number--;
		}

		System.out.println("Factorial of " + temp + " is : " + factorial);
	}
}
