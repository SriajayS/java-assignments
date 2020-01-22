package com.nubes.cj.basics;

import java.util.Scanner;

public class negative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter s number");
		int num=sc.nextInt();
		if(num<0) {
			int res=Math.abs(num);
			System.out.print("the result is "+res);
			
			
		}
	}

}
