package com.java.demo;

public interface Persona {

	int x = 10;
	
	void test1();
	
	String test2(String name);
	
	Boolean test3();
	
	default void test4() {
		System.out.println("This is a default method");
	}
}
