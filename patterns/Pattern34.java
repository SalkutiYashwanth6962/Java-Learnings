

package com.patterns;

public class Pattern34 {
  public static void main(String[] args) {
	  int num=5;
	 
	for(int i=1;i<=num;i++) {
		 int k=1;
		for(int j=1;j<=num;j++) {
			if(i+j>=num+1) {
				System.out.print(k++ + " ");
			}else {
				System.out.print("  ");
			}
			
					
			
			
		}
		System.out.println();
	}
}
}
