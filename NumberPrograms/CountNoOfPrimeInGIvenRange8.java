package com.NumberPrograms;

public class CountNoOfPrimeInGIvenRange8 {
  public static void main(String[] args) {
	int start=10;
	int end=40;
	int count=0;
	for(int i=start;i<=end;i++) {
		if(checkPrime(i)) {
			System.out.println(i);
			count++;
		}
	}
	System.out.println(count);
  }
	
	public static boolean checkPrime(int n) {
		int count2=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count2++;
				
			}
		}
		if(count2==2) {
			return true;
		}
		return false;
	}
	

}
