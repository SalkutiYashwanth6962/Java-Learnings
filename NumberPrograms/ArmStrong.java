package com.NumberPrograms;

public class ArmStrong {
  public static void main(String[] args) {
	if(checkArmStrong(153)) {
		System.out.println("ArmStrong number");
	}else {
		System.out.println("Not a ArmStrong");
	}
}
  public static boolean checkArmStrong(int n) {
		int count1=0; int temp=n; int num2=n;
		while(n!=0) {
			count1++;
			n=n/10;
		}
		int sum=0;int exp=count1;
		while(num2!=0) {
			int base=num2%10;
			sum=sum+power(base, exp);
			num2=num2/10;
		}
		
		if(temp==sum) {
			return true;
		}
		
	return false;
	}
  public static int power(int base,int exp) {
		int result=1;
		for(int i=1;i<=exp;i++) {
	     result=result*base;
		}
		return result;
	}
}

