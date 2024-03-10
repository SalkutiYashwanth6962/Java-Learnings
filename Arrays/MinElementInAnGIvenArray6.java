package com.Arrays;

public class MinElementInAnGIvenArray6 {
  public static void main(String[] args) {
	  int arr[]= {1,2,3,4};
	System.out.println(minElement(arr));
   }
  public static int minElement(int arr1[]) {
	  int minEle=arr1[0];
	  for(int i=0;i<arr1.length;i++) {
		  if(arr1[i]<minEle) {
			  minEle=arr1[i];
		  }
	  }
	  return minEle;
  }
}
