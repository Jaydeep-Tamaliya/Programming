package com.jsp.NumberSystemExample;
//write a program to define a method to covert given decimal value into octal.
public class DecimalToOctal {
	public static void main(String[] args) {
		int n=0;
		
		String bin=decToBin(n);
		System.out.println(bin);
	}

	public static String decToBin(int n) {
		
		
		String s="";
		
		if(n==0)
		{
			s=n%8+s;
			return s;
		}
		
		while(n>0)
		{
			s=n%8+s;
			
			n=n/8;
		}
		
		return s;
	}
}
