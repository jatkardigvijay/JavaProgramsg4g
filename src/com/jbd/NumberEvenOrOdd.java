package com.jbd;

import java.util.Scanner;

public class NumberEvenOrOdd {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = input.nextInt();
		input.close();
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}
}
