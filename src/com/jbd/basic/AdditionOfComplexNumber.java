package com.jbd.basic;

import java.util.Scanner;

public class AdditionOfComplexNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int real1, real2, iNum1, iNum2;

		System.out.print("Enter real number 1 : ");
		real1 = input.nextInt();

		System.out.print("Enter imaginary number 1 : ");
		iNum1 = input.nextInt();

		System.out.print("Enter real number 2 : ");
		real2 = input.nextInt();

		System.out.print("Enter imaginary number 2 : ");
		iNum2 = input.nextInt();

		input.close();

		System.out.println("First complex number is : " + real1 + " + i" + iNum1);

		System.out.println("Second complex number is : " + real2 + " + i" + iNum2);

		int real = real1 + real2;
		int imaginary = iNum1 + iNum2;

		System.out.println("Addition of two complex numbers is : " + real + " + i" + imaginary);
	}
}
