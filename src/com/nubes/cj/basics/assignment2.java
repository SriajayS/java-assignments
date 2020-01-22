package com.nubes.cj.basics;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight of 1st person");
		float w1=sc.nextFloat();
		System.out.println("Enter the weight of 2nd person");
		float w2=sc.nextFloat();
		System.out.println("Enter the weight of 3rd person");
		float w3=sc.nextFloat();
		float sumweight=w1+w2+w3;
		float avg_weight=sumweight/3;		
System.out.println("the sum of weights of 3person is"+sumweight +"kgs  andthe averageweightis "+avg_weight+"kgs" );
				
		}
}