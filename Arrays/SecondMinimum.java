package com.Arrays;

public class SecondMinimum {
  public static void main(String[] args) {
	int arr[]= {7,3,4,2,2,5,3,3};
	int min=arr[0];
	int secmin=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			secmin=min;
			min=arr[i];
		}else if(arr[i]<secmin ||min==secmin) {
			if(arr[i]!=min) {
				secmin=arr[i];
			}
		}
	}
	System.out.println(min);
	System.out.println(secmin);
}
}
