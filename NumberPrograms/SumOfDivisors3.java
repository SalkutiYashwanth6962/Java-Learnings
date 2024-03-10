package com.NumberPrograms;

public class SumOfDivisors3 {
	public static int sumOfDivisors(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
		return sum;
	}
   public static void main(String[] args) {
	System.out.println(sumOfDivisors(20));
}
}
