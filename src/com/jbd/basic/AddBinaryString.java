package com.jbd.basic;

import java.util.Scanner;

public class AddBinaryString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s1, s2;
		int sum = 0, carry = 0;
		System.out.print("Enter string 1 : ");
		s1 = input.nextLine();
		System.out.print("Enter string 2 : ");
		s2 = input.nextLine();
		input.close();
		int i = s1.length() - 1, j = s2.length() - 1;
		StringBuilder result = new StringBuilder();
		while (i >= 0 || j > 0 || carry == 1) {
			sum = carry;
			if (i >= 0) {
				sum = sum + s1.charAt(i) - '0';
			}
			if (j >= 0) {
				sum = sum + s2.charAt(j) - '0';
			}
			result.append((char) (sum % 2 + '0'));
			carry = sum / 2;
			i--;
			j--;
		}
		String result1 = result.reverse().toString();
		System.out.print("Addition of two binary strings " + s1 + " and " + s2 + " is : " + result1);

	}
}
