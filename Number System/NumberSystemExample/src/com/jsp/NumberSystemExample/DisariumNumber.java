package com.jsp.NumberSystemExample;
//write a program to define a method to check the given number is disarium number or not.
public class DisariumNumber {
	public static void main(String[] args) {
		int n=598;
		
		if(isDisarium(n))
			System.out.println("Disarium number");
		else
			System.out.println("Not");
	}

	public static boolean isDisarium(int n) {
		int temp=n;
		int sum=0;
		int p=digitCount(n);
		
		while(n>0)
		{
			sum=sum+ntoPowerP(n%10,p);
			p--;
			n=n/10;
		}
		return temp==sum;
	}

	public static int ntoPowerP(int n, int p) {
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*n;
		}
		return  res;
	}

	public static int digitCount(int n) {
		int count=0;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
}
