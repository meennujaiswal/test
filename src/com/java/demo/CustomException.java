package com.java.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;

public class CustomException {
    public static void main(String[] args) {
        try(BufferedReader resource = new BufferedReader(new FileReader(new File("C://")))) {
      
        	CustomException exception = new CustomException();
        	exception.someMethodThrowsException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void someMethodThrowsException() throws MyException{
    	throw new MyException("This is a custom exception");
    }
}
