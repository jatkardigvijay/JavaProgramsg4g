package com.jbd;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {

		int number1, number2, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		number1 = input.nextInt();
		System.out.println("Enter number 2 : ");
		number2 = input.nextInt();
		System.out.println("Before Swapping, number 1 is : " + number1 + " & and number 2 is : " + number2);
		input.close();
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("Before Swapping, number 1 is : " + number1 + " & and number 2 is : " + number2);
	}
}
