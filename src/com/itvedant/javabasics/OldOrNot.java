package com.itvedant.javabasics;

import java.util.Scanner;

public class OldOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
//		Or
		
		String msg = age>18?"You can vote":"You can't vote";
		System.out.println(msg);
	}
}
