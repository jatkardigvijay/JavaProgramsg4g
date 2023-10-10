package com.jbd.inheritance;

public class Test {

	public static void main(String[] args) {
		
		// calling all members of A
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		a.m1();
		a.m2();
		System.out.println("=====");
		
		// calling all members of B
		// here members of class A and B both will be called
		// If member present in A but not in B, that member of A is called (10, m1())
		// Same way, if member present in B but not A, B's member would be called (40, m3())
		// Note: where the members are overidden in B class i.e. b variable and m2 method, the overridden members would be called.
		// hence, 30 which is overridden in B and m2() are called
		B b = new B();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.c);
		b.m1();
		b.m2();
		b.m3();
		System.out.println("=====");
		
		// assignment of sub class to super
		// here all varibales of A will be called. Also, all methods present in A called.
		// methods which are overridden in B and present in A, then those overridden will be called
		A ab = new B();
		System.out.println(ab.a);
		System.out.println(ab.b);
		ab.m1();
		ab.m2();
	}
}
