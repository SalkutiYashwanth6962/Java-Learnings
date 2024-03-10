package com.Arrays2D;

import java.util.Scanner;

public class Demo1 {
  public static void main(String[] args) {
	  System.out.println("Enter the elements-"+3*3);
	  Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}
}
