package com.jbd.polymorphism;

public class OverloadingEx {

	public void m1(int a, int b) {
		int sum;
		sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is : " + sum);
	}

	public void m1(double a, double b) {
		double sum;
		sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is : " + sum);
	}

	public static void main(String[] args) {

		OverloadingEx oe = new OverloadingEx();
		oe.m1(22.8887, 1);
		oe.m1(21.99, 1);
	}
}
