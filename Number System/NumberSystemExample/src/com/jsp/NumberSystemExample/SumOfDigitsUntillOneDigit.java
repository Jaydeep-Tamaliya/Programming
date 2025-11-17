package com.jsp.NumberSystemExample;
//write a program to define a method to print the sum of each digit untill getting single digit.
public class SumOfDigitsUntillOneDigit {
	public static void main(String[] args) {

		int n=8896;
		
		
		System.out.println(sumTillSingleDigit(n));
		
	}

	public static int sumTillSingleDigit(int n) {
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				sum=sum+n%10;
				n=n/10;
			}
			
			n=sum;
		}
		
		return n;
		
	}
}
