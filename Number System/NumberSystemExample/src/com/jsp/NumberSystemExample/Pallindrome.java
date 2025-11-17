package com.jsp.NumberSystemExample;
//write a program to define a method to chech the given number is pallindrome or not.
public class Pallindrome {
	public static void main(String[] args) {
		int n=12;
		
		if(isPallidrome(n))
			System.out.println("Pallidrome number");
		else
			System.out.println("Not");
	}
	
	public static boolean isPallidrome(int n)
	{
		int temp=n;
		int rev=0;
		
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			
			n=n/10;
		}
		
		return rev==temp;
	}
}
