package com.jsp.NumberSystemExample;
//write a program to print nearest prime number for the given number.
public class NearestPrimeNumber {
	public static void main(String[] args) {
		int n=51;
		
		int res=nearestPrimeNumber(n);
		System.out.println(res);
	}

	public static int nearestPrimeNumber(int n) {
		int temp1=n;
		int temp2=n;
		if(isPrime(n))
		{
			return n;
		}
		
		while(true)
		{
			if(isPrime(--temp1))
				return temp1;
			if(isPrime(++temp2))
				return temp2;
		}
	}

	public static boolean isPrime(int n) {
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
