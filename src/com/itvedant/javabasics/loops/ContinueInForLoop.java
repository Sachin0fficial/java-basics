package com.itvedant.javabasics.loops;

public class ContinueInForLoop {
	public static void main(String[] args) {
		for(int i = 1;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
