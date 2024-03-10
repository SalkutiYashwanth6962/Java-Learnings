package com.Arrays;

import java.util.Arrays;

public class ReplacingOddIndexElementsWIth500bb9 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
	
	System.out.println(Arrays.toString(replaceFunction(arr)));
		
		
	}
	public static int[] replaceFunction(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
				arr[i]=500;
			}
		}
		return arr;
	}
}
