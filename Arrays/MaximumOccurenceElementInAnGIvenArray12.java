package com.Arrays;

public class MaximumOccurenceElementInAnGIvenArray12 {
     public static void main(String[] args) {
		int a[]= {1,3,4,5,6,7,3,4,3};
		System.out.println(maximumOccured(a));
		
		//System.out.println(maxELe);
	}
     public static int maximumOccured(int a[]) {
    	 int maxCount=0;
 		int maxELe=0;
 		for(int i=0;i<a.length;i++) {
 			int ele1=a[i];
 			int count=0;
 			for(int j=0;j<a.length;j++) {
 				int ele2=a[j];
 				if(ele1==ele2) {
 					count++;
 				}
 			}
 			if(count>maxCount) {
 				maxCount=count;
 				maxELe=ele1;
 			}
 		}
 		return maxELe;
     }
}
