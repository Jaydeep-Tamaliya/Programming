package com.jsp.NumberSystemExample;
//write a program to print the sum of all the odd numbers present between 1 to 50.
public class OddSum {
	public static void main(String[] args) {
		int n=50;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
				sum=sum+i;
		}
		System.out.println(sum);
	}
}
