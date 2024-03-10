package com.recursion;

public class NumberOfDivisors7 {
  public static void main(String[] args) {
	int i=1;
	int n=10;
	int count=0;
	System.out.println(noOfDiv(i,n,count));
}
  public static int noOfDiv(int i,int n,int count) {
	  if(i>n) {
		  return count;
	  }
	  else {
		  if(n%i==0) {
			  count++;
		  }
	  }
	  return noOfDiv(++i,n,count);
  }
}
