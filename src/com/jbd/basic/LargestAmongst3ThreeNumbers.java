package com.jbd.basic;

import java.util.Scanner;

public class LargestAmongst3ThreeNumbers {

	public static void main(String[] args) {

		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		num1 = input.nextInt();
		System.out.println("Enter number 2 : ");
		num2 = input.nextInt();
		System.out.println("Enter number 3 : ");
		num3 = input.nextInt();
		input.close();
		largetNumber(num1, num2, num3);
	}

	private static void largetNumber(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the larger than " + num2 + " and " + num3);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the larger than " + num1 + " and " + num3);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is the larger than " + num1 + " and " + num2);
		}
	}
}
