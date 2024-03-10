package com.NumberPrograms;

public class NumberOfDigitsInGivenNumber10 {
   public static void main(String[] args) {
	int num=123456;
	
	count(num);
   }
   public static void count(int num) {
	   int count=0;
	   while(num!=0) {
			//num=num%10;
			
			num=num/10;
			count++;
		}
		System.out.println(count);
   }
	

}
