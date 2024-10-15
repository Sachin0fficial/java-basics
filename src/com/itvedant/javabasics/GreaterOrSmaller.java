package com.itvedant.javabasics;

import java.util.Scanner;

public class GreaterOrSmaller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second number :");
		int b = sc.nextInt();
		System.out.println("Enter the third number :");
		int c = sc.nextInt();
		
		String max = a>b?"First is big "+a:"Second is big"+b;
		String min = a<b?"first number is big":"second number is big";
		System.out.println(max);
		System.out.println(min);
		String maxx = a>b&&a>c?"first is big"+a:b>c?"second is greater"+b:"c is greater"+c;
		System.out.println(maxx);
		String minn = a<b&&a<c?"first is small "+a:b<c?"second is small "+b:"c is small "+c;
		System.out.println(minn);
	}
}
