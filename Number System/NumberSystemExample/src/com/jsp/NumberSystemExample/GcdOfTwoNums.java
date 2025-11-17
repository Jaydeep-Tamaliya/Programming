package com.jsp.NumberSystemExample;
//write a program to define a method to find the greatest common divisor of given two numbers.
public class GcdOfTwoNums {
	public static void main(String[] args) {
		int n=12;
		int m=36;
		
		int gcd=gcd(n,m);
		
		System.out.println(gcd);
				
				
	}
	
	public static int gcd(int n,int m)
	{
		int gcd=1;
		
		for(int i=1;i<=m&&i<=n;i++)
		{
			if(n%i==0&&m%i==0)
				gcd=i;
		}
		
		return gcd;
	}
	
}
