package com.wipro.calculator;
import java.util.Scanner;

public class oddeven {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int number;
		System.out.println("enter number 1");
		
		number=scan.nextInt();
		if(number%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");


			
	}
}
