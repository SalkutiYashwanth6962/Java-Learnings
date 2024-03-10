package com.recursion;

public class SumOfDivisors6 {
   public static void main(String[] args) {
	int i=1;
	int n=10;
	int sum=0;
	System.out.println(sumOfDivisors(i,n,sum));
}
   public static int sumOfDivisors(int i,int n,int sum) {
	   if(i>n) {
		   return sum;
		   
	   }
	   else {
		   if(n%i==0) {
			   sum=sum+i;
		   }
	   }
	   return sumOfDivisors(++i,n,sum);
   }
}
