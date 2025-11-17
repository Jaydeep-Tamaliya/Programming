package com.jsp.NumberSystemExample;
//write a program to check the given year is leap year or not.
public class CheckLepYearOrNot {
	public static void main(String[] args) {
		int year=2025;
		
		if(year%100!=0&&year%4==0)
			System.out.println("Leap Year");
		
		else if(year%400==0)
			System.out.println("Leap Year");
		
		else
			System.out.println("Not Leap Year");
			
	}
}
