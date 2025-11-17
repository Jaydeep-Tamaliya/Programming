package com.jsp.NumberSystemExample;
//write a program to define a method to count the sum of prime digits present in the given number.
public class SumOfPrimeDigits {
	
	public static void main(String[] args) {
		int n=575723;
		
		int primeSum=primeSum(n);
		
		System.out.println(primeSum);
	}
	
	public static int primeSum(int n)
	{
		int primeSum=0;
		
		while(n>0)
		{
			int rem=n%10;
			
			if(isPrime(rem))
				primeSum=primeSum+rem;
			
			n=n/10;
		}
		
		return primeSum;
	}
	
	public static boolean isPrime(int rem)
	{
		if(rem<=1)
			return false;
		
		for(int i=2;i<=rem/2;i++)
		{
			if(rem%i==0)
				return false;
		}
		
		return true;
	}
	
}
