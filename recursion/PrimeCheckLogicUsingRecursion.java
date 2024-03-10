package com.recursion;

public class PrimeCheckLogicUsingRecursion {
 public static void main(String[] args) {
    if(checkPrime(17)) {
    	System.out.println("Prime");
    }
    else {
    	System.out.println("NotPrime");
    }
}
 public static boolean checkPrime(int num) {
	 if(num<=1) {
		 return false;
		 
	 }
	 int i=1;
	 int count=0;
	 int c2=noOfDiv(num,i,count);
	 if(c2==2) {
		 return true;
	 }
	 return false;
 }
 public static int noOfDiv(int num,int i ,int count) {
	 if(i>num) {
		 return count;
	 }else {
		 if(num%i==0) {
			 count++;
		 }
	 }
	 return noOfDiv(num,++i,count);
 }
}
