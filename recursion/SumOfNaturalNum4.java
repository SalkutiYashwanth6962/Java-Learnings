package com.recursion;

public class SumOfNaturalNum4 {
 public static void main(String[] args) {
	int i=1;
	int n=5;
	int sum=0;
	System.out.println(sumOfNum(i,n,sum));
}
 public static int sumOfNum(int i,int n,int sum) {
	 if(i>n) {
		return sum; 
	 }else {
		 sum=sum+i;
	 }
	 return sumOfNum(++i,n,sum);
 }
}
