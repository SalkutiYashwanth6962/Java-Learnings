package com.Arrays;

public class DuplicateElementsRemoval10 {
  public static void main(String[] args) {
	int a[]= {1,2,3,4,3,2,1,4};
	int element=500;
	for(int i=0;i<a.length;i++) {
		int ele2=a[i];
		for(int j=i+1;j<a.length;j++) {
			if(a[j]==ele2) {
				a[j]=element;
			}
		}
	}
	int b[]=new int[a.length];
	int l=0;
	for(int k=0;k<a.length;k++) {
		int ele3=a[k];
		if(ele3!=element) {
			b[l++]=ele3;
			
		}
	}
	for(int i=0;i<b.length;i++) {
		if(b[i]!=0) {
			System.out.println(b[i]);
		}
		
	}
	
}
}
