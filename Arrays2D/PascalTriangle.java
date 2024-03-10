package com.Arrays2D;

import java.util.Scanner;

public class PascalTriangle {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows ");
	int size=sc.nextInt();
	int [][] b=pascalTriangle(size);
	for(int[] c:b) {
		for(int d:c) {
			System.out.print(d+" ");
		}
		System.out.println();
	}
	
	
}
  public static int[][] pascalTriangle(int size){
	  int a[][]=new int[size][];
	  for(int i=0;i<size;i++) {
	    	if(j==0||i==j) {
	    		arr[i][j]=1;
	    	}
	    }  
  }
   
}
