package com.jsp.NumberSystemExample;
//write a program to define a method to check the given number is prime number or not.
public class IsPrimeOrNot {
	public static void main(String[] args) {
		int n=29;
		
		if(isPrime(n))
			System.out.println("Prime Number...");
		
		else 
			System.out.println("Not");
	}
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		
		return true;
	}
}
