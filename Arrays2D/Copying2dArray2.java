package com.Arrays2D;




import java.util.Scanner;

public class Copying2dArray2 {
  public static void main(String[] args) {
	  System.out.println("Enter the elements-"+3*3);
	  //Scanner sc=new Scanner(System.in);
	int arr[][]= {{1,2,3},{2,3,4},{3,4,5}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	System.out.println("*******************");
	int[][] arr2=new int[arr.length][arr.length];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
		arr2[i][j]=arr[i][j];	
		}
		//System.out.println();
	}
	//printing
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}
}
