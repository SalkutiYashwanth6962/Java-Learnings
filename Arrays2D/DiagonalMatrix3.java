package com.Arrays2D;

public class DiagonalMatrix3 {
 public static void main(String[] args) {
	 int arr[][]= {{1,2,3},{2,0,4},{2,4,5}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j||i+j==arr.length-1) {
					System.out.println(arr[i][j]);
				}
				
			}
			//System.out.println();
		}
}
}
