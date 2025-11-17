package com.jsp.NumberSystemExample;
//write a program to define a method to check the given number is armstrong number or not.
public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		
		if(isArmstrong(n))
			System.out.println("Armstrong");
		else
			System.out.println("Not");
	}
	
	public static boolean isArmstrong(int n)
	{
		int p=count(n);
		
		int temp=n;
		int sum=0;
		while(n>0)
		{	
			int rem=n%10;
			sum=sum+nToPowerP(rem,p);
			n=n/10;
		}
		
		return sum==temp;
	}
	
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		
		return count;
	}
	
	public static int nToPowerP(int n,int p)
	{
		int res=1;
		
		for(int i=1;i<=p;i++)
		{
			res=res*n;
		}
		
		return res;
	}
}
