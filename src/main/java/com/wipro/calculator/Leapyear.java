package com.wipro.calculator;

import java.util.Scanner;

public class Leapyear {

public static void main(String args[]) {
	
	Scanner scan=new Scanner(System.in);
	int year;
	System.out.println("enter year");

	year=scan.nextInt();
	if(year%4==0)
		System.out.println("leap year");
	else
		System.out.println("not leap year");

	
	
}
}
