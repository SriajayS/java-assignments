package com.nubes.cj.basics;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num1 value ");
	int num1=sc.nextInt();
	System.out.println("Enter the num2 value ");
	int num2=sc.nextInt();
    int sum=num1+num2;
    System.out.println("sum of "+num1+ "and" +num2+  "10is"+sum );
    sc.close();
	}
}
