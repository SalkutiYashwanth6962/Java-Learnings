package com.NumberPrograms;

public class NumberOfDivisorsCount5 {
	public static int divisorsCount(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+" ");
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println("count :"+ divisorsCount(30));
	}

}
