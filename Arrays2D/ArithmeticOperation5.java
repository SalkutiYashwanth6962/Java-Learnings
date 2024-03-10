package com.Arrays2D;

public class ArithmeticOperation5 {
  public static void main(String[] args) {
	  int arr1[][]= {{1,2,3},{2,3,4},{3,4,5}};
	  int arr2[][]= {{7,8,9},{3,4,5},{1,2,3}};
	  int arr3[][]=new int[arr1.length][arr1.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
			//System.out.println();
		}
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}
}
}
