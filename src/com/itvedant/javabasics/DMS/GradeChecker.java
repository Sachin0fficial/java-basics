package com.itvedant.javabasics.DMS;

import java.util.Scanner;

public class GradeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number obtain in Math");
		int a = sc.nextInt();
		System.out.println("enter the number obtain in Physics");
		int b = sc.nextInt();
		System.out.println("enter the number obtain in Chemistry");
		int c = sc.nextInt();
		System.out.println("enter the number obtain in English");
		int d = sc.nextInt();
		System.out.println("enter the number obtain in Hindi");
		int e = sc.nextInt();
		double per = (a+b+c+d+e)/5;
		
		if(per>90) {
			System.out.println("Your grade is A+");
		}
		else if(per>80) {
			System.out.println("Your grade is A");
		}
		else if(per>70){
			System.out.println("Your grade is B+");
		}
		else if(per>60) {
			System.out.println("Your grade is B");
		}
		else {
			System.out.println("You are failed");
		}
		System.out.println(per+"%");
	}
}
