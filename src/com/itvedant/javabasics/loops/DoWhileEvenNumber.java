package com.itvedant.javabasics.loops;

public class DoWhileEvenNumber {
	public static void main(String[] args) {
		int num = 1;
		do {
			if(num%2==0) {
				System.out.println(num);
			}
			num++;
		}
		while(num<=30);
	}
}
