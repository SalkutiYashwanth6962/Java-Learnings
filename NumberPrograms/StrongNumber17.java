package com.NumberPrograms;

public class StrongNumber17 {
 public static void main(String[] args) {
	if(checkStrong(145)) {
		System.out.println("Strong number");
	}else {
		System.out.println("Not a Strong number");
	}
}
 public static boolean checkStrong(int num) {
	 int sum=0; int temp=num;
	
	 while(num!=0) {
		 int rem=num%10;
		 int fact=1;
		 for(int i=1;i<=rem;i++) {
			 fact=fact*i;
			 
		 }
		 sum=sum+fact;
	//	sum=sum+ Factorial16.factorial(rem);
		num=num/10;
		System.out.println(num);
		System.out.println(sum);
	 }
	 if(sum==temp) {
		 return true;
	 }
	 return false;
 }
}
