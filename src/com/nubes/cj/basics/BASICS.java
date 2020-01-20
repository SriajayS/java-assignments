package com.nubes.cj.basics;

import java.util.Scanner;

public class BASICS {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1,num2,num3;
	System.out.println("enter the num1");
	 num1=sc.nextInt();
	System.out.println("enter the num2");
	 num2=sc.nextInt();
	 System.out.println("enter the num3");
	 num3=sc.nextInt();
	 if(num1>num2&&num1>num3)
		 System.out.println("biggest number is"+num1);
	 else if(num1>num2&&num1>num3)
		 System.out.println("biggest number is"+num2);
	 else
		 System.out.println("biggest number is"+num2);
	  

	 sc.close();
}
}
	
