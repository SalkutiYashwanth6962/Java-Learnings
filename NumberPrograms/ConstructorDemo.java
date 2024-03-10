package com.NumberPrograms;

public class ConstructorDemo {
	static double a;
    double b;
	
	ConstructorDemo( double c){
		this.a=c;
	}
	ConstructorDemo( double c,double d){
		this(c);
		b=d;
	}
	
   public static void main(String[] args) {
	   System.out.println(a);
	   ConstructorDemo d=new ConstructorDemo(3.0,3.5);
	   System.out.println(d.a);
	   System.out.println(d.b);
	
}
}
