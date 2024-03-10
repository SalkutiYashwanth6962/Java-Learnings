package com.NumberPrograms;

public class SumOfFIrstDigitAndLastDigit11 {
 public static void main(String[] args) {
	System.out.println(sumOfFirstAndLastDigit(23456));
}
 public static int sumOfFirstAndLastDigit(int n) {
	 int sum=0;
	 int num=n;
	 while(n!=0) {
		 if(n<10||num==n) {
			 int rem=n%10;
			 sum=sum+rem;
			 
		 }
		n=n/10;
		 
	 }
	 return sum;
 }
 
 
}
