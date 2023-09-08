package com.jbd.basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		char ch;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character : ");
		ch = input.next().charAt(0);
		input.close();
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Entered character is a vowel");
		} else {
			System.out.println("Entered character is not a vowel");
		}
	}
}
