package com.nubes.cj.basics;

import java.util.Scanner;

public class biiling {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the billing amount");
	float amount=sc.nextFloat();
	float discount=0;
	if(amount >6000) {
		discount = amount*0.1f;
	}
		float netamount=amount-discount;
  
	System.out.println("your net billing amount"+netamount);
	sc.close();
	}
}



