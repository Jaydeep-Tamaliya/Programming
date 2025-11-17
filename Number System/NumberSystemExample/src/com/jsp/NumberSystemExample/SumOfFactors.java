package com.jsp.NumberSystemExample;
//write a program to print the sum of all the factors.
public class SumOfFactors {
	public static void main(String[] args) {
		int n=100;
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		sum=sum+n;
		
		System.out.println(sum);
	}
}
