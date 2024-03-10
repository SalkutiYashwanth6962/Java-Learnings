

package com.patterns;

public class Pattern39 {
  public static void main(String[] args) {
	  int num=3;
	 
	for(int i=1;i<2*num;i++) {
		 int k=1;
		for(int j=1;j<2*num;j++) {
			if((i+j<=2*num && i<=j)||(i+j>=2*num && i>=j)) {
				System.out.print(k++ + " ");
			}else {
				System.out.print("  ");
			}
			
					
			
			
		}
		System.out.println();
	}
}
}
