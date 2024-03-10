package com.NumberPrograms;

public class NeonNumber {
  public static void main(String[] args) {
	if(checkNeon(24)) {
		System.out.println("Neon Number");
	}else {
		System.out.println("Not a Neon Number");
	}
}
  public static boolean checkNeon(int n) {
	  int square=n*n;
	  int sum=0;
	  while(square!=0) {
		  int rem=square%10;
		  sum=sum+rem;
		  square=square/10;
	  }
	  if(sum==n) {
		  return true;
	  }
	  
		return false;
	}
}
