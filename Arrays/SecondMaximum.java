package com.Arrays;

public class SecondMaximum {
  public static void main(String[] args) {
	int arr[]= {1,2,2,2,2,3,3,3,3,4,4,4,5,5,5,};
	int max=arr[0];
	int secmax=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			secmax=max;
			max=arr[i];}
//		}else if(arr[i]>secmax ||max==secmax) {
//			if(arr[i]!=max) {
//				secmax=arr[i];
//			}
//		}
	}
	System.out.println(max);
	System.out.println(secmax);
}
}
