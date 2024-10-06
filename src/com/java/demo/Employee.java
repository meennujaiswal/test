package com.java.demo;

import java.util.Comparator;
import java.util.List;

//POJO - Plain Old Java Objects
public class Employee implements Comparator<Employee>{

	private String name;
	private String email;
	private String address;
	private int age;
	private List<Integer> intList;
	//Noarg constructor->not necessary to define
	
	Employee(){
	  
	}
	 
	Employee(String name){
		this.name = name;
	}
	
	public void callMethod() {
		System.out.println("This is Parent method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.contains("123")) {
			return;
		}
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		boolean compare = o1.getAge() > o2.getAge()
		return compare == true ? 1 : 0;
	}
	
	
	
}
