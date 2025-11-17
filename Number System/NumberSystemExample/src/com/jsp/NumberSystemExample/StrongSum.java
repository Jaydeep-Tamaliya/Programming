package com.jsp.NumberSystemExample;
//write a progrm to print the sum of all the strong number 1 to n.
public class StrongSum {
	public static void main(String[] args) {
		int n=1000;
		
		int strongSum=strongSumTill1toN(n);
		System.out.println(strongSum);
	}

	public static int strongSumTill1toN(int n) {
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(isStrong(i))
				sum=sum+i;
		}
		
		
		return sum;
		
	}

	public static boolean isStrong(int i) {
		int temp=i;
		int sum=0;
		while(i>0)
		{
			sum=sum+fact(i%10);
			i=i/10;
		}
		
		return temp==sum;
	}

	public static int fact(int n) {
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		
		return fact;
	}
}
