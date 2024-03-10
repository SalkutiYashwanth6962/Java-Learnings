package com.patterns;

public class Pattern40 {
  public static void main(String[] args) {
	  int num=4;
	for(int i=1;i<2*num+1;i++) {
		for(int j=1;j<2*num+1;j++) {
			if((i+j>=num+1 && j-i<=num &&i<=num)||(i>=num && i-j<=num && i+j<=3*num+1)) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
}
}
