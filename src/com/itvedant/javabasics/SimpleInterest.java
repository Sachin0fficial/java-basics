package com.itvedant.javabasics;

import java.util.Scanner;

public class SimpleInterest {
	
public static void main(String[] args) {
//	write a program to find a simple intrest
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter  the value of p : ");
	int p = sc.nextInt();
	System.out.println("Enter  the value of t : ");
	int t = sc.nextInt();
	System.out.println("Enter  the value of r : ");
	int r = sc.nextInt();
	
	double simpleIn = (p*t*r)/100;
	System.out.println(simpleIn);
}
}
