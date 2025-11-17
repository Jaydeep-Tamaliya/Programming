package com.jsp.NumberSystemExample;
//write a program to define a method to find the factorial for the given number.
public class FindFactorial {
	public static void main(String[] args) {
		int n=5;
		
		int fact=fact(n);
		System.out.println(fact);
	}
	
	
	public static int fact(int n)
	{
		int fact=1;
		
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		
		return fact;
	}
}
