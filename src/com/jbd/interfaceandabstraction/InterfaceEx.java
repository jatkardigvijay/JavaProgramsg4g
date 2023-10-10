package com.jbd.interfaceandabstraction;

public class InterfaceEx implements InterfaceI1 {

	@Override
	public void m1() {

		System.out.println("I am in InterfaceEx class");
	}

	public static void main(String[] args) {
		
		InterfaceI1.m2();
		InterfaceEx ex = new InterfaceEx();
		ex.m1();
	}

}
