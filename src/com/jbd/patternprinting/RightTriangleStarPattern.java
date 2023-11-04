package com.jbd.patternprinting;

import java.util.Scanner;

public class RightTriangleStarPattern {

	public static void main(String[] args) {

		int number;
		System.out.print("Enter the number : ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		input.close();
		rightTriangleStarPattern(number);
	}

	private static void rightTriangleStarPattern(int number) {
		
		for (int i = 1; i <= number; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
