package com.Arrays;

public class RightRotation {
    public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int userInput=2;
		int b[]=new int[a.length];
		int m=0;
		for(int i= a.length-userInput ;i<=a.length-1;i++) {
			b[m++]=a[i];
		}
		for(int i=0;i<a.length-userInput;i++) {
			b[m++]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
	}
}
