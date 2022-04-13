package com.wipro.calculator;

import java.util.Scanner;
public class Calculator {
	//entry point of java program
	public static void main(String args[]) {
		
		//read the input from keyboard
		// new keyword used to create the object
		Scanner scan=new Scanner(System.in);
		//declare variables-local
		int numberOne,numberTwo,result;
		System.out.println("enter number 1");
		
		numberOne=scan.nextInt();
		System.out.println("enter number 2");
		
		numberTwo=scan.nextInt();
		result=numberOne+numberTwo;
		System.out.println("Addition of two number"+result);
		
		System.out.println("welcome to stackroute Program");
		
	}
	//predefined class-- starts with uppercase

}
