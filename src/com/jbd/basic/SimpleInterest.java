package com.jbd.basic;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		double principalAmount, rateOfInterest, numberOfYears;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principal amount : ");
		principalAmount = input.nextDouble();
		System.out.println("Enter the rate of interest : ");
		rateOfInterest = input.nextDouble();
		System.out.println("Enter the time in years : ");
		numberOfYears = input.nextDouble();
		input.close();
		calculateSimpleInterest(principalAmount, rateOfInterest, numberOfYears);
	}

	private static void calculateSimpleInterest(double principalAmount, double rateOfInterest, double numberOfYears) {

		double simpleInterest = (principalAmount * numberOfYears * rateOfInterest) / 100;
		System.out.println("Simple Interest is : " + simpleInterest);

	}
}
