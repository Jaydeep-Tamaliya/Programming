package com.jsp.NumberSystemExample;

public class DecimalToBinaray {
	public static void main(String[] args) {
		int n=14;
		
		String bin=decToBin(n);
		System.out.println(bin);
	}

	public static String decToBin(int n) {
		
		String s="";
		
		while(n>0)
		{
			s=n%2+s;
			
			n=n/2;
		}
		
		return s;
	}
}
