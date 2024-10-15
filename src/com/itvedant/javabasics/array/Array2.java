package com.itvedant.javabasics.array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int age[]=new int[size];
		
		for(int i = 0;i<size;i++) {
			System.out.println("Enter value");
			age[i]=sc.nextInt();
		}
		for(int i = 0;i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
		for(int a:age) {
			System.out.print(a);
		}
	}
}
