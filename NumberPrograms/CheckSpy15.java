package com.NumberPrograms;

public class CheckSpy15 {
  public static void main(String[] args) {
	if(checkSpy(123)) {
		System.out.println("Spy Number");
	}else {
		System.out.println("Not a Spy Number");
	}
}
  public static boolean checkSpy(int n) {
	  //int square=n*n;
	 int sum=0;
	 int product=1;
	  while(n!=0) {
		  int rem=n%10;
		  product=product*rem;
		  sum=sum+rem;
		  n=n/10;
	  }
	  
	  if(product==sum) {
		  return true;
	  }
	  
		return false;
	}
}
