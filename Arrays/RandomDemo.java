package com.Arrays;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
	Random r = new Random();
	int n=r.nextInt(10);
	System.out.println(n);
}
}
