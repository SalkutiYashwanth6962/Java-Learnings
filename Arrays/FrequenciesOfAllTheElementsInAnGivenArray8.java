package com.Arrays;

public class FrequenciesOfAllTheElementsInAnGivenArray8 {
  public static void main(String[] args) {
	int[] arr= {1,2,3,4,1,3,4};
	for(int i=0;i<arr.length;i++) {
		System.out.println("Frequency of particular "+arr[i]+"number is:"+frequency(arr,arr[i]));
	}
 }
  public static int frequency(int arr[],int n) {
	  int count=0;
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]==n) {
			  count++;
		  }
	  }
	  return count;
  }
}
