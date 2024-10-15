package com.itvedant.javabasics.loops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = a;
		int c = a;
		int count = 0;
		double arm =0;
		while(a!=0) {
			a = a/10;
			count++;
			
		}
		while(b!=0) {
			int rem = b%10;
			arm = arm + Math.pow(rem, count);
			b = b/10;
		}
		
		if(c==arm) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not a armstrong");
		}
		
		
	}
}
