package com.jsp.NumberSystemExample;
//write a program to define a method to convert decimal to hexadecimal.
public class DecimalToHexaDecimal {
	public static void main(String[] args) {
		int dec=333;
		String hex=decToHex(dec);
		System.out.println(hex);
	}

	public static String decToHex(int dec) {
		String hex="";
		
		while(dec>0)
		{
			int rem=dec%16;
			
			if(rem>9)
			{
				hex=(char)(rem+55)+hex;
			}
			else
				hex=rem+hex;
			
			dec=dec/16;
		}
		
		return hex;
	}
}
