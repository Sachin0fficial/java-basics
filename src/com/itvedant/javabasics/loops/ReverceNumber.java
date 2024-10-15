package com.itvedant.javabasics.loops;

import java.util.Scanner;

public class ReverceNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hhe number You want to check is pelildrome or not : ");
		int num = sc.nextInt();
		int pel = num;
		int reverse = 0;
		while(num!=0) {
			int rem = num%10;
			reverse = reverse*10+rem;
			num = num/10;
		}
		if(pel==reverse) {
			System.out.println("Number is pelildrom");
		}
		else {
			System.out.println("Number is not a pelildrom");
		}
		
	}
}
