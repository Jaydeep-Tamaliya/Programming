package com.jsp.NumberSystemExample;
//write a program to define a method to check the given numbrer is strong or not.
public class StrongNumber {
	public static void main(String[] args) {
		int n=40585;
		
		if(isStrong(n))
			System.out.println("Strong");
		else 
			System.out.println("Not");
	}
	
	public static boolean isStrong(int n)
	{
		
		if(n==0)
			return false;
		int sum=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
		
		return sum==temp;
	}
	
	public static int fact(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*n;
			n--;
		}
		
		return fact;
	}
}
