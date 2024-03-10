

package com.patterns;

public class Pattern21 {
  public static void main(String[] args) {
	  int num=3;
	for(int i=1;i<2*num;i++) {
		for(int j=1;j<=num;j++) {
			if(j==3||i-j==2||i+j==num+1) {
				System.out.print("* ");	
			}else {
				System.out.print("  ");
		}
			
		}
		System.out.println();
	}
}
}
