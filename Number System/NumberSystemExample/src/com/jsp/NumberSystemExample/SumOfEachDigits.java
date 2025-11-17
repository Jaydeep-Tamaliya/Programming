package com.jsp.NumberSystemExample;
//write a program to define a method to print the sum of each digits present in the given number.
public class SumOfEachDigits {
	public static void main(String[] args) {
		int n=12345;
		
		int sum=sumOfDigits(n);
		
		System.out.println(sum);
	}
	
	public static int sumOfDigits(int n)
	{
		int sum=0;
		
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		
		
		return sum;
	}
}
