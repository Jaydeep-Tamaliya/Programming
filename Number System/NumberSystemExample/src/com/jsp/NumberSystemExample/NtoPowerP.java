package com.jsp.NumberSystemExample;
//write a program to define a method to find n to the power p.
public class NtoPowerP {
	public static void main(String[] args) {
		int n=5;
		int p=5;
		
		int res=nToPowerP(n,p);
		
		System.out.println(res);
	}
	
	
	public static int nToPowerP(int n,int p)
	{
		int temp=1;
		
		for(int i=1;i<=p;i++)
		{
			temp=temp*n;
		}
		
		return temp;
	}
}
