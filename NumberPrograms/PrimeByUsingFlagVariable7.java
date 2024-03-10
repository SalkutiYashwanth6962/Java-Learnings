package com.NumberPrograms;

public class PrimeByUsingFlagVariable7 {
	public static void main(String[] args) {
		boolean flag=true;
		int n=10;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println("Prime");
		}else {
			System.out.println("Not  a prime");
		}
	}

}
