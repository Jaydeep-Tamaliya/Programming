package com.jsp.NumberSystemExample;
//write a program to define a method to check the given number is Neon number or not.
public class NeonNumber {
	public static void main(String[] args) {
			
		int n=121;
		
		if(isNeon(n))
			System.out.println("Neon");
		
		else
			System.out.println("Not");
		
	}
	
	public static boolean isNeon(int n)
	{
		int sqr=n*n;
		int sum=0;
		while(sqr>0)
		{
			sum=sum+(sqr%10);
			sqr=sqr/10;
		}
		
		return n==sum;
	}
}
