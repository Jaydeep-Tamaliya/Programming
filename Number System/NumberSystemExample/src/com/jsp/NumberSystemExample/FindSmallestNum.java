package com.jsp.NumberSystemExample;
//write a program to print the smallest number among 4 numbers using if statements.
public class FindSmallestNum {
	public static void main(String[] args) {
		int a=10,b=10,c=5,d=20;
		
		int smallest=a;
		
		if(b<smallest)
			smallest=b;
		if(c<smallest)
			smallest=c;
		if(d<smallest)
			smallest=d;
		
		System.out.println(smallest);
			
	}
}
