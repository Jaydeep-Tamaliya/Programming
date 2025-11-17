package com.jsp.NumberSystemExample;
//write a program to define a method to check the  given number is happy number or not.
public class HappyNumber {
	public static void main(String[] args) {
		int n=7;
		
		if(isHappy(n))
			System.out.println("Happy Number");
		else
			System.out.println("Not");
	}

	public static boolean isHappy(int n) {
		
		int p=2;
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				sum=sum+power(n%10,p);
				
				n=n/10;
			}
			
			n=sum;
		}
		
		return n==1||n==7;
	}

	public static int power(int n,int p) {
		
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow=pow*n;
		}
		
		return pow;
		
	}
}
