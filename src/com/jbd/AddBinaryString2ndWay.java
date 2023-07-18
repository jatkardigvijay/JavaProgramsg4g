package com.jbd;

import java.util.Scanner;

public class AddBinaryString2ndWay {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter string 1 : ");
		s1 = input.nextLine();

		System.out.println("Enter string 2 : ");
		s2 = input.nextLine();

		input.close();

		int num1 = Integer.parseInt(s1, 2);

		int num2 = Integer.parseInt(s2, 2);

		int sum = num1 + num2;

		String result = Integer.toBinaryString(sum);

		System.out.println("Addition of two binary strings " + s1 + " and " + s2 + " is : " + result);
	}
}
