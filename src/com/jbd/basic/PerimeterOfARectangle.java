package com.jbd.basic;

import java.util.Scanner;

public class PerimeterOfARectangle {

	public static void main(String[] args) {

		double length, breadth;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		length = input.nextDouble();
		System.out.println("Enter the breadth of rectangle : ");
		breadth = input.nextDouble();
		input.close();
		perimeterOfRectangle(length, breadth);
	}

	private static void perimeterOfRectangle(double length, double breadth) {

		double perimeter;
		perimeter = 2 * (length + breadth);
		System.out.println("The perimeter of rectangle is : " + perimeter);
	}
}
