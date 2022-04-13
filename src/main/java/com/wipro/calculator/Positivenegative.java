package com.wipro.calculator;
import java.util.Scanner;
public class Positivenegative {
public static void main(String args[]) {
	
	Scanner scan=new Scanner(System.in);
	int number;
	System.out.println("enter a number");

	number=scan.nextInt();
	if(number>0)
		System.out.println(" number is positive");
	if(number<0)
		System.out.println("number is negative");
	if(number==0)
		System.out.println("number is zero");

	
	
}
}
