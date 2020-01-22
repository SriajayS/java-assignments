package com.nubes.cj.basics;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number num1:");
		int num1=sc.nextInt();
		System.out.println("enter the second number num2:");
		int num2=sc.nextInt();
		System.out.println("before swap,the value of num1="+num1+ "and num2 ="+num2);
		int temp=num1;
		 num1=num2;
		num2 =temp;		 ;
		 
		System.out.println("a fterswap,the value of num1="+num1+ "and num2 ="+num2);
		
		}

		}


