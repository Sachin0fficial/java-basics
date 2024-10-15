package com.itvedant.javabasics.DMS;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		if(a>50) {
			if(a%2==0)
				System.out.println("Number is even ");
			System.out.println("Number is odd ");
		}
		else {
			System.out.println("number is less then 50");
		}
		}
}
