package com.jsp.NumberSystemExample;
//write a program to define a method to reverse the given number.
public class ReverseNumber {
	public static void main(String[] args) {
		int n=456;
		
		int reverseNum=reverse(n);
		
		System.out.println(reverseNum);
	}
	
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			
			rev=rev*10+rem;
			
			n=n/10;
			
		}
		
		return rev;
	}
}
