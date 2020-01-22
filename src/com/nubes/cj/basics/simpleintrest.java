package com.nubes.cj.basics;

import java.util.Scanner;

public class simpleintrest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the principal amount");
		int amount=sc.nextInt();
		System.out.println("enter the rate of interest");
		float rate=sc.nextFloat();
		System.out.println("enter the time");
		int time=sc.nextInt();
	float si=amount*rate*time/100;	
	System.out.println("simple intrest is"+si);
				sc.close();
	
	}

}
