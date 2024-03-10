package com.recursion;

public class CountNumberOfDigits5 {
//   public static void main(String[] args) {
//	int count=0;
//	int num=12345;
//	System.out.println(countNum(num,count));
//}
//   public static int countNum(int num,int count) {
//	   if(num==0) {
//		   return count;
//		   
//	   }else {
//		   num=num/10;
//		   ++count;
//	   }
//	   return countNum(num,count);
//   }
	
	public static void main(String[] args) {
		int count=0;
		int num=12345;
		System.out.println(countNoOfDigits(num,count));
	}
	public static int countNoOfDigits(int num,int count) {
		if(num==0) {
			return count;
		}else {
			num=num/10;
			count++;
		}
		return countNoOfDigits(num,count);
	}
}
