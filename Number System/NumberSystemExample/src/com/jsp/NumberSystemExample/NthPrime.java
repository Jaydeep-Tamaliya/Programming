package com.jsp.NumberSystemExample;
///write a program to print nth pirme number.
public class NthPrime {
	public static void main(String[] args) {
		int n=3;
		
		printNthPrime(n);
	}

	public static void printNthPrime(int m) {
		int count=0;
		int n=1;
		while(true)
		{
			while(count<m)
			{
				if(isPrime(n)){
					
					count++;
				}
				n++;
			}
			System.out.println(--n);
			break;
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
