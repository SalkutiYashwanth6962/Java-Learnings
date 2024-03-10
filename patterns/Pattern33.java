

package com.patterns;

public class Pattern33 {
  public static void main(String[] args) {
	  int num=5;
	 
	for(int i=1;i<=num;i++) {
		 int k=5;
		for(int j=1;j<=num;j++) {
			if(i<=j) {
				System.out.print(k-- + " ");
			}else {
				System.out.print("  ");
			}
			
					
			
			
		}
		System.out.println();
	}
}
}
