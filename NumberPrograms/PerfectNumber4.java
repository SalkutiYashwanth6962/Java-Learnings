package com.NumberPrograms;

public class PerfectNumber4 {
	public static boolean checkPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
 public static void main(String[] args) {
	 
	if(checkPerfect(10)) {
		System.out.println("Perfect Number");
	}else {
		System.out.println("Not a Perfect Number");
	}
}
}
