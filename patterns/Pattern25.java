

package com.patterns;

public class Pattern25 {
  public static void main(String[] args) {
	  int num=5;
	 
	for(int i=1;i<=num;i++) {
		 char ch='A';
		for(int j=1;j<=num;j++) {
			if(i<=j) {
				System.out.print(ch++ + " ");
			}else {
				System.out.print("  ");
			}
			
					
			
			
		}
		System.out.println();
	}
}
}
