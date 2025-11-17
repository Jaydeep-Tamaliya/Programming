package com.jsp.NumberSystemExample;
//write a program to print first n prime numbers.
public class FirstNprime {
	public static void main(String[] args) {
		int n=5;
		
		printFirstNprime(n);
	}

	public static void printFirstNprime(int m) {
		int count=0;
		int n=1;
		while(true)
		{
			while(count<m)
			{
				if(isPrime(n)){
					System.out.println(n);
					count++;
				}
				n++;
			}
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
