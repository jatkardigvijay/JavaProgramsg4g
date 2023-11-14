package com.jbd.classesandobjects;

public class EncapsulationDemo {

	int age;

	public void setAge(int age) {
		if (age <= 0) {
			age = 0;
			System.out.println(age);
		} else {
			this.age = age;
			System.out.println(age);
		}
	}

	public static void main(String[] args) {

		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setAge(-1);
		
		
	}
}
