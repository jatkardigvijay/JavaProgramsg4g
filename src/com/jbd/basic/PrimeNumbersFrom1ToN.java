package com.jbd.basic;

import java.util.Scanner;

public class PrimeNumbersFrom1ToN {

	public static void main(String[] args) {

		int number;
		System.out.print("Enter a number : ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		input.close();
		primeNumbersFrom2ToNumber(number);
	}

	private static void primeNumbersFrom2ToNumber(int number) {

		int i, m;
		boolean flag;
		m = number / 2;
		for (i = 2; i <= m; i++) {

			if (number % i == 0) {
				flag = true;
				break;
			} else {
				System.out.println(i;
			}
		}

	}
}
