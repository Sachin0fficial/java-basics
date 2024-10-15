package com.itvedant.javabasics.array;

public class Array3 {
	public static void main(String[] args) {
		int nums[]= {12,43,56,75,45,89,67,85,74,37,85,63,27,96,88};
		int sum = 0;
		for(int i = 0;i<nums.length;i++) {
			if(i%2==0) {
				sum=sum+nums[i];
			}
		}
		System.out.println(sum);
	}

}
