package com.NumberPrograms;

public class Prime6 {
	public static boolean checkPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
	}
  public static void main(String[] args) {
	if(checkPrime(7)) {
		System.out.println("Prime");
	}else {
		System.out.println("Not Prime");
	}
}
}
