package com.NumberPrograms;

public class HarshadNumber14 {
  public static void main(String[] args) {
	if(checkHarshad(81)) {
		System.out.println("Harshad Number");
	}else {
		System.out.println("Not a Harshad Number");
	}
}
  public static boolean checkHarshad(int n) {
	  //int square=n*n;
	  int num2=n;
	  int sum=0;
	  while(n!=0) {
		  int rem=n%10;
		  sum=sum+rem;
		  n=n/10;
	  }
	  
	  if(num2%sum==0) {
		  return true;
	  }
	  
		return false;
	}
}
