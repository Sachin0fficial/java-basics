package com.itvedant.javabasics;

import java.util.Scanner;

public class Arithmatic1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Entter the first number : ");
		int a = sc.nextInt();
		System.out.println("Entter the second number : ");
		int b = sc.nextInt();
		
		System.out.println("Addition "+ a+b);
		System.out.println("Subtraction "+ (a-b));
		System.out.println("Multiplication "+ a*b);
		System.out.println("Division "+ a/b);
		System.out.println("Modulus "+ a%b);
		
//		write a program to find area of the circle
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Entter the radius : ");
//		int a = sc.nextInt();
//		double area =3.14*a*a;
//		System.out.println(area);
		
		
		
	}

}
