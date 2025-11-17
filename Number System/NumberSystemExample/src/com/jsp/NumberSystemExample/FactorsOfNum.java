package com.jsp.NumberSystemExample;
//write a program to find the factor or divisor for the given number.
public class FactorsOfNum {
	public static void main(String[] args) {
		int n=24;
		
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
		
		System.out.println(n);
	}
}
