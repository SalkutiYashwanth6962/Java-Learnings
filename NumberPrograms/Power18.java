package com.NumberPrograms;

public class Power18 {
 public static void main(String[] args) {
	System.out.println(power(2,4));
}
 public static int power(int base,int exp) {
	 int res=1;
	 for(int i=1;i<=exp;i++) {
		 res=res*base;
	 }
	 return res;
 }
}
