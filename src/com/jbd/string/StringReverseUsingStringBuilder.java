package com.jbd.string;

import java.util.Scanner;

public class StringReverseUsingStringBuilder {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		string = input.nextLine();
		input.close();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(string);
		stringBuilder.reverse();
		System.out.println("Reverse string of : " + string + " is : " + stringBuilder);
	}
}
