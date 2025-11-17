package com.jsp.NumberSystemExample;
//write a program to validate the given date.
public class ValidateDate {
	public static void main(String[] args) {
		int d=30;
		int m=2;
		int y=400;
		
		
		if(d<1||d>31||m<1||m>12||y<1)
			System.out.println("invalid");

		else if((m==4||m==6||m==9||m==11)&&d>30)
			System.out.println("invalid");
		
		else if((y%100!=0&&y%4!=0)&&d>28&&m==2)
			System.out.println("invalid");
		
		else if((y%100!=0&&y%4==0)&&m==2&&d>29)
			System.out.println("invalid");
		
		else if(y%400==0&&m==2&&d>29)
			System.out.println("invalid");
		
		else if(y%100==0&&y%400!=0&&m==2&&d>28)
			System.out.println("invalid");
		
		else
			System.out.println("valid");
		
		
	}
}
