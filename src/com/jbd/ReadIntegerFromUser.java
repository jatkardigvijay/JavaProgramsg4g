package com.jbd;

import java.util.Scanner;

public class ReadIntegerFromUser {

	public static void main(String[] args) {

		System.out.print("Enter an integer : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		System.out.println("Entered number is : " + number);
	}
}
