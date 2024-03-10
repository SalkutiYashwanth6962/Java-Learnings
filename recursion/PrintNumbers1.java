package com.recursion;

public class PrintNumbers1 {
	//printing natural numbers from 1 to n
// public static void main(String[] args) {
//	 int start =1;
//	 int end =5;
//	 print(start,end);
//}
// public static void print(int i,int num) {
//	 if(i>=num) {
//		 System.out.println(i);
//		 return;
//	 }
//	 else {
//		 System.out.println(i);
//	 }
//	 print(i+1,num);
// }
	
	public static void main(String[] args) {
		int num=10;
		print(num);
	}

	public static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		print(n-1);
		
	}
 
}
