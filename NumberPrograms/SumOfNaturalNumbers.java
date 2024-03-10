package com.NumberPrograms;

public class SumOfNaturalNumbers {
	    
	public static int sumOfNaturalNum(int n) {
		 int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
			
		}
		return sum;
	}
 public static void main(String[] args) {
	System.out.println(sumOfNaturalNum(30));
}
}