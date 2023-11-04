package com.jbd.patternprinting;

import java.util.Scanner;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {

		int number;
		System.out.print("Enter the number : ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		input.close();
		leftTriangleStarPattern(number);
	}	

	private static void leftTriangleStarPattern(int number) {

		for (int i = 0; i < number; i++) {

			for (int j = 2 * (number - i); j >= 0; j--) {

				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
