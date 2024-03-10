package com.recursion;

public class Factorial8 {
	public static void main(String[] args) {
		int fact=1;
		int num=6;
		System.out.println(factorial(fact,num));
	}
	public static int factorial(int fact,int num) {
		if(num==0) {
			return fact;
		}else {
			fact=fact*num;
		}
		return factorial(fact,--num);
	}
  
}


/*public static void main(String[] args) {
	int fact=1;
	int num=5;
	System.out.println(factorial(fact,num));
}
  public static int factorial(int fact,int num) {
	  if(num==0) {
		  return fact;
	  }else {
		  fact =fact*num;
	  }
	  return factorial(fact,--num);
  }*/