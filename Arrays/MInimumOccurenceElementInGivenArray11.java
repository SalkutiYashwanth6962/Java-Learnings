package com.Arrays;

public class MInimumOccurenceElementInGivenArray11 {
  public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,1,2,4,5};
	int minCount=arr.length-1;
	int minEle=0;
	for(int i=0;i<arr.length;i++) {
		int ele1=arr[i];
		int count=0;
		for(int j=0;j<arr.length;j++) {
			int ele2=arr[j];
			if(ele1==ele2) {
				count++;
			}
		}
		if(count<minCount) {
			minEle=ele1;
			minCount=count;
		}
	}
	System.out.println(minEle);
}
}
