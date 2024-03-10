

package com.patterns;

public class Pattern36 {
  public static void main(String[] args) {
	  int num=3;
	  int k=1;
	for(int i=1;i<=num;i++) {
		
		for(int j=1;j<=2*num;j++) {
			if(i+j>=num+1&& j-i<num) {
				System.out.print(k++ + " ");
			}else {
				System.out.print("  ");
			}
			
					
			
			
		}
		System.out.println();
	}
}
}
