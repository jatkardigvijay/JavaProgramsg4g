package com.jbd.basic;

import java.util.Scanner;

public class PrimeNumbersFrom1ToN {

	public static void main(String[] args) {

		int number;
		System.out.print("Enter a number : ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		input.close();
		System.out.print("Prime numbers are : ");
		primeNumbersFrom2ToNumber(number);
	}

	private static void primeNumbersFrom2ToNumber(int number) {

		int i;

		for (i = 2; i <= number; i++) {
			boolean flag = true;
			for (int j = 2; j <= (i / 2); j++) {

				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i+" ");
			}

		}

	}
}
