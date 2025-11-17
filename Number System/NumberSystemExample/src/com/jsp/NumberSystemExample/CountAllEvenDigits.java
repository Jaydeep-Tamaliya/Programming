package com.jsp.NumberSystemExample;
//write a program to define a method to count how many even digits are present in the given number.
public class CountAllEvenDigits {
	public static void main(String[] args) {
		int n=13567889;
		
		int count=countEvenDigits(n);
		
		System.out.println(count);
	}
	
	public static int countEvenDigits(int n)
	{
		int count=0;
		
		while(n>0)
		{
			if((n%10)%2==0)
				count++;
			
			n=n/10;
		}
		
		return count;
	}
}
