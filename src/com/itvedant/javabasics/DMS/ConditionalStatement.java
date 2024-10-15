package com.itvedant.javabasics.DMS;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shop status in open or close ");
		String shop = sc.next();
		String o = "open";
		String c = "close";
		if(shop.equals(o)) {
			System.out.println("You can buy shop is open ");
		}
		else if(shop.equals(c)) {
			System.out.println("You can't buy shop is close ");
		}
		else {
			System.out.println("provide answer in open and close option");
		}
		
		}
}
