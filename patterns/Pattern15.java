

package com.patterns;

public class Pattern15 {
  public static void main(String[] args) {
	  int num=3;
	for(int i=1;i<2*num;i++) {
		for(int j=1;j<2*num;j++) {
			if( i==1||i==2*num-1||i==j||i+j==2*num) {
				System.out.print("* ");	
			}else {
				System.out.print("  ");
		}
			
		}
		System.out.println();
	}
}
}
