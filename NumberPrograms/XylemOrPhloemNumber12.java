package com.NumberPrograms;

public class XylemOrPhloemNumber12 {
   public static void main(String[] args) {
	if(checkXylemOrPhloem(23435)) {
		System.out.println("Xylem");
	}
	else {
		System.out.println("Phloem");
	}
}
   public static boolean checkXylemOrPhloem(int n) {
	   int num=n;
	   int extremeSum=0;
	   int meanSum=0;
	   while(n!=0) {
		   if(n<10||n==num) {
			   int rem=n%10;
			   extremeSum=extremeSum+rem;
			   
		   }else {
			   int rem2=n%10;
			   meanSum=meanSum+rem2;
		   }
		   n=n/10;
	   }
	   if(extremeSum==meanSum) {
		   return true;
	   }else {
		   return false;
	   }
	  
	 
   }
}
