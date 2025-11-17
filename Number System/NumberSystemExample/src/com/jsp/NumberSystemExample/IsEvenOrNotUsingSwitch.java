package com.jsp.NumberSystemExample;
//write a program to check the given number is even or not using switch statements.
public class IsEvenOrNotUsingSwitch {
	public static void main(String[] args) {
		int n=51;
		
		switch(n%2)
		{
			case 0: System.out.println("Even Number...");
					break;
					
			default:System.out.println("Odd Number...");
					
		}
	}
}
