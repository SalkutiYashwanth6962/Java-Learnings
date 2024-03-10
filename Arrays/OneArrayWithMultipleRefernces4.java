package com.Arrays;

public class OneArrayWithMultipleRefernces4 {
  public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5,6,6};
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
	}
	int arr2[]=arr1;
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr2[i]);
	}
	
}
}
