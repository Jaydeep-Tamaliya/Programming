package com.jsp.NumberSystemExample;
//write a program to find the biggest number among 3 numbers using if statements only.
public class FindBiggestNum {
	public static void main(String[] args) {
		int a=21;
		int b=25;
		int c=21;
		
		int big=a;
		
		if(b>big)
			big=b;
		
		if(c>big)
			big=c;
		
		
		System.out.println(big);
		
	}
}
