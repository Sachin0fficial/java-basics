package com.itvedant.javabasics.DMS;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose option \n 1 to check balance.\n 2 to withdraw.\n 3 to deposite amount");
		int a = sc.nextInt();
		int input = 0;
		int amount = 1000;
		switch(a) {
		case 1:
			System.out.println("Your Account Balance is : "+amount);
			break;
		case 2:
			System.out.println("enter the amount you want to withdraw");
			input = sc.nextInt();
			if(amount>input) {
				amount = amount - input;
				System.out.println("Your available balance"+amount);
			}
			else {
				System.out.println("Your balance is low");
			}
			break;
		case 3:
			System.out.println("Enter the amount you want to deposit");
			input = sc.nextInt();
			amount = amount+input;
			System.out.println("total current balance is :"+amount);
			break;
		default:
			System.out.println("Please enter valis choice ");
			break;
		}
	}
}
