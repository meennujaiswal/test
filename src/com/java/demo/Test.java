package com.java.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public static void main(String args[]) {
		//Primitives types - stored in stack
		int age = 25;
		double salary = 50000.50;
		char grade = 'A';
		boolean isJavaFun = true;
		
		//Stored in heap memory - ref types
		
		Employee empObj1 = new Employee();
		
		String examString = "Test";
		int[] intArray = {};
		
		int number = 10;
		if (number > 0) {
		    System.out.println("The number is positive.");
		} else if (number > 10) {
		    System.out.println("The number is negative.");
		}else {
			
		}
		
		int day = 3;
		/*switch (day) {
		    case 'a':
		        System.out.println('Monday');
		        break;
		    case 2:
		        System.out.println('Tuesday');
		        break;
		    case 3:
		        System.out.println('Wednesday');
		        break;
		    default:
		        System.out.println('Invalid day');
		        break;
		}*/
		
		for (int i = 0; i < 5; i++) {
		    System.out.println("i is: " + i);
		}
		
		List<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee("Keshab");
		Employee emp2 = new Employee("Meennu");
		Employee emp3 = new Employee();
		
		employees.add(emp1);
		employees.add(emp2);
		
		for(Employee empObj : employees) {
			
			System.out.println(empObj.name);
			
		}
		
		int i = 0;
		/*
		 * while (i < 5) { System.out.println('i is: ' + i); i++; }
		 * 
		 * int i = 0; do { System.out.println('i is: ' + i); i++; } while (i < 5);
		 */
		
		Employee emp4 = new Employee("Test");
		
		emp4.callMethod();
		
		emp4 = new FullTimeEmployee();
		
		emp4.callMethod();
				
		FullTimeEmployee fte1 = new FullTimeEmployee();
		fte1.test1();
		fte1.test2("Some String");
		
		fte1 = (FullTimeEmployee) new Employee();
		fte1.test1();
		
	}

}
