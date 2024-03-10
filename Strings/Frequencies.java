package com.Strings;
import java.util.Scanner;
public class Frequencies {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any string ");
    String str=sc.next();
    int count2=0;
    for(int i=0;i<str.length();i++) {
    	char ch=str.charAt(i);
    	if(ch=='a') {
    		count2++;
    	}
    	if(count2==2) {
    		count2=0;
    		continue;
    	}
    	System.out.println(ch+ " " +frequency(str,ch));
    }
    
	}
	public static int frequency(String str,char ch) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch==ch1) {
				count++;
			}
		}
		return count;
		
	}

}
