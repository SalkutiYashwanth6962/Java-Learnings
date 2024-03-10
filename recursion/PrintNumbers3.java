package com.recursion;

public class PrintNumbers3 {
 public static void main(String[] args) {
	 int i=1;
	 int n=5;
	print(i,n);
}
 public static void print(int i,int n) {
	 if(i>=n) {
		 System.out.println(i);
		 return;
	 }
	 System.out.println(i);
	 print(++i,n);
 }
}
