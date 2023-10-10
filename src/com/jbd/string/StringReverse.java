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
		char[] ch = string.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {

			reverse = reverse + ch[i];

		}
		System.out.println("Reversed string of " + string + " is : " + reverse);
	}
}
