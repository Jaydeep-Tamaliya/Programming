package com.jsp.NumberSystemExample;
//write a program to print all the even number present between 1 to 100.
public class PrintEvenNumbers {
	public static void main(String[] args) {
		
//		for(int i=1;i<=100;i++)
//		{
//			if(i%2==0)
//				System.out.println(i);
//		}
		
		int i=0;
		while(i<100)
		{
			i=i+2;
			System.out.println(i);
		}
		
	}
}
