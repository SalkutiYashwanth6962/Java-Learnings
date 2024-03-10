package com.Arrays;

public class RepeatedElementReplacement {
  public static void main(String[] args) {
	  //i/p=1,2,2,4
	  //o/p=1,2,3,4
	int arr[]= {1,2,2,4};
	int rep=0;
	int maxCount=0;
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				
			}
		}
		if(count>maxCount) {
			maxCount=count;
			rep=arr[i];
			
		}
		
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==rep) {
			arr[i+1]=rep+1;
		}
		System.out.println(arr[i]);
	}
	
	
	//System.out.println(maxCount);
	
}
}
