package com.jbd;

import java.util.Scanner;

public class Multiply2FloatingNumbers {

	public static void main(String[] args) {

		float number1 = 0, number2 = 0, result;
		System.out.print("Enter number 1 : ");
		Scanner input = new Scanner(System.in);
		number1 = input.nextFloat();
		System.out.println("Enter number 2 : ");
		number2 = input.nextFloat();
		input.close();
		result = number1 * number2;
		System.out.println("Result is : " + result);
	}
}
