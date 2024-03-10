package com.Arrays2D;

public class MaxElementInEachRowAndStoreIn1dArray7 {
  public static void main(String[] args) {
	int a[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	int b[]=new int[a.length];
	int k=0;
	for(int i=0;i<a.length;i++) {
		int max=0;
		for(int j=0;j<a.length;j++) {
			if(max<a[i][j]) {
				max=a[i][j];
				
			}
		}
		b[k++]=max;
	}
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
}
}
