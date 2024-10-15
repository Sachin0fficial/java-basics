package com.itvedant.javabasics.DMS;

import java.util.Scanner;

public class PositiveOrNegetive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit you want to check if positive or negetive : ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("Entered number is positive : "+num);
		}
		else if(num<0) {
			System.out.println("Entered number is negetive : "+num);
		}
		else {
			System.out.println("Zero is not a positive or negetive number ");
		}
	}
}
