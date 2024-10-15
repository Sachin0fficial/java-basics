package com.itvedant.javabasics.array;

public class Array1 {
	public static void main(String[] args) {
//		first way to create array
//		int age[]= {24,56,46,87,23,15,20};
//		System.out.println(age[2]);
//		int sum = 0;
//		for(int a:age) {
//			if(a%2==0) {
//				sum = sum+a;
//			}
//		}
//		System.out.println(sum);
		
//		second way to create array
//		String[] name = new String[3];
//		name[0]="Ram";
//		name[1]="Sachin";
//		name[2]="Shubham";
//		for(String a:name) {
//			System.out.print(a+" ");
//		}
//		String count = "";
//		char[] ch = {'a','w','t','u','x'};
//		for(char c : ch) {
//			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//				count++;
//			count = count + c;
//			
//		}
//		System.out.println(count);
//		
//		find the maximum value in array
//		int[] arr = {3,54,64,732,23,64,56};
//		int max = 0;
//		for(int a:arr) {
//			if(max<a) {
//				max =a;
//			}
//		}
//		System.out.println(max);
		int[] arr = {3,54,64,732,23,64,56};
		int a = arr.length;
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[a-1]+" ");
			a--;
		}
		System.out.println();
		for(int i = arr.length -1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
