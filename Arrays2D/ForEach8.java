package com.Arrays2D;

public class ForEach8 {
 public static void main(String[] args) {
	int arr[]= {11,2,3,4};
	for(int n:arr) {
		System.out.println(n);
	}
	int arr1[][]= {{11,2,3,4},{11,2,3,4}};
	for(int n[]:arr1) {
		for(int num:n) {
			System.out.println(num);
		}
		
	}
}
}
