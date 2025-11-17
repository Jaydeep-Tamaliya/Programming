package com.jsp.NumberSystemExample;
//write a program to print sanju if the number is divisible by 3, print geeta if the number is divisible by 5,
//print sanju weds geeta if the number is divisible by both 3 and 5 otherwise print breakup.
public class Example1 {
	public static void main(String[] args) {
		int n=11;
		
		if(n%3==0&&n%5==0)
			System.out.println("sanju weds geeta");
		else if(n%3==0)
			System.out.println("sanju");
		else if(n%5==0)
			System.out.println("geeta");
		else
			System.out.println("breakup");
	}
}
