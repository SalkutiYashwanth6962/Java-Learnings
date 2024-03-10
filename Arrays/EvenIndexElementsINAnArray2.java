package com.Arrays;

public class EvenIndexElementsINAnArray2 {
   public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4 };
//	int arr1[]= {1,2,3,4};
//	int arr2[]=new int[4] ;
//	arr2[0]=1;
//	arr2[1]=1;
//	arr2[2]=1;
//	arr2[3]=1;
//	//arr2[4]=1;
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr2[i]);
//		
//	}
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			System.out.println(arr[i]);
		}
	}
	
}
}
