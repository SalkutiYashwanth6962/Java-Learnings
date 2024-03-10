package com.Arrays;

public class OddElementsInAnGIvenArray3 {
  public static void main(String[] args) {
	int arr[]= {1,3,4,56,7};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==1) {
			System.out.println(arr[i]);
		}
	}
}
}
