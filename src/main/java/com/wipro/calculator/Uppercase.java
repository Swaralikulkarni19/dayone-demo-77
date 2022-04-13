package com.wipro.calculator;

import java.util.Scanner;

public class Uppercase {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		char ch;
		System.out.println("enter charcter");
		
		ch=scan.next().charAt(0);
		if(ch>='a'&&ch<='z')
			System.out.println("lowercase");
		if(ch>='A'&&ch<='Z')
			System.out.println("uppercase");
		else
			System.out.println("not character");


			
	}

}
