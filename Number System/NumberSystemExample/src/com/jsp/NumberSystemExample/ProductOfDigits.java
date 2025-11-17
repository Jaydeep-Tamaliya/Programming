package com.jsp.NumberSystemExample;
//write a program to define a method to count the product of each digits present in the given number.
public class ProductOfDigits {
	public static void main(String[] args) {
		int n=2465;
		
		int prod=poductOfEachDigits(n);
		
		System.out.println(prod);
	}
	
	public static int poductOfEachDigits(int n)
	{
		int prod=1;
		
		while(n>0)
		{
			prod=prod*(n%10);
			
			n=n/10;
		}
		
		
		return prod;
	}
}
