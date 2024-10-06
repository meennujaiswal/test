package com.java.demo;

public class FullTimeEmployee extends Employee implements Persona{
	
	String foodCardNumber;
	
	@Override
	public void callMethod() {
		System.out.println("This is Child method");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String test2(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean test3() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
