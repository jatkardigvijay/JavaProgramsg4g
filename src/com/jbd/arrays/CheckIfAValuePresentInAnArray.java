package com.jbd.arrays;

import java.util.Scanner;

public class CheckIfAValuePresentInAnArray {

	public static void main(String[] args) {

		int number, numberYouWantToCheck;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements in an array : ");
		number = input.nextInt();
		int array[] = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.print("The array is : ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Enter the number you want to check : ");
		numberYouWantToCheck = input.nextInt();
		input.close();
		for (int i : array) {
			if (array[i] == numberYouWantToCheck) {
				System.out.println("The value you want to check is present in the array and it is : " + array[i]);
				break;
			}
		}
	}
}
