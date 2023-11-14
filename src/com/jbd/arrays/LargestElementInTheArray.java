package com.jbd.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInTheArray {

	public static void main(String[] args) {

		int number;
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
		input.close();
		System.out.println();
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println("The maximum element in the array is : " + max);
	}
}
