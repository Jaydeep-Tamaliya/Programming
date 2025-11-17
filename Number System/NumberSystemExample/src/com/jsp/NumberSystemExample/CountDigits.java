package com.jsp.NumberSystemExample;
//write a program to define a method to count how many digits are present in the given number.
public class CountDigits {
	public static void main(String[] args) {
		int n=123;
		
		int digits=countDigit(n);
		
		System.out.println(digits);
	}
	
	
	public static int countDigit(int n)
	{
		int digits=0;
		while(n>0)
		{
			n=n/10;
			digits++;
		}
		
		return digits;
	}
}
