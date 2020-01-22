package com.nubes.cj.basics;

import java.util.Scanner;

public class difference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a firstnumber num1");
		int num1=sc.nextInt();
		System.out.println("enter a secondnumber num2");
		int num2=sc.nextInt();
		int result =Math.abs (num1-num2);
		System.out.println("the result  is"+result);
	}

}
