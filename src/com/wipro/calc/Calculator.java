package com.wipro.calc;

import java.util.Scanner;

//Class Name and File Name are same
public class Calculator {
	// Entry Point of Java Program
	public static void main(String args[]) {
	
		// Read the Input From KeyBoard
		// new keyword used to create object
		Scanner scan=new Scanner(System.in);
		// Variables  -  Local 
		int numberOne,numberTwo,result;
		System.out.println("Enter Number 1");
		numberOne=scan.nextInt();
		System.out.println("Enter Number 2");
		numberTwo=scan.nextInt();

		result=numberOne+numberTwo;
		
		System.out.println("Addition of Two Number " + result);
		System.out.println("Welcome to Stackroute Program");
		
		
	}
	
	// Predefined Class --  Starts with UpperCase 
	// String / System
	
	
	
	
}


