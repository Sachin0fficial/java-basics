package com.itvedant.javabasics.loops;

public class DoWhileSum {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		do {
			sum=sum+num;
			num++;
		}
		while(num<=20);
		System.out.println(sum);
	}
}
