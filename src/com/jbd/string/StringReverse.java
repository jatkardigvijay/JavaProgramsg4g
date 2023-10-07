package com.jbd.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string : ");
		string = input.nextLine();
		input.close();
		reverse(string);
	}

	private static void reverse(String string) {

		String reverse = "";
		System.out.println("1");
		char[] ch = string.toCharArray();
		System.out.println("2");
		for (int i = ch.length; i > 0; i--) {
			System.out.println("3");
			reverse = reverse + ch[i];
			System.out.println("4");

		}
		System.out.println("5");
		System.out.println("Reverse string of " + string + " is : " + reverse);
	}
}
