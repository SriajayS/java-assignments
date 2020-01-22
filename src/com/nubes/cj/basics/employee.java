package com.nubes.cj.basics;

import java.util.Scanner;

public class employee {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the employee no:");
	int no=sc.nextInt();
	System.out.println("enter the employee name:");
	String name=sc.nextLine();
	sc.nextLine();
	System.out.println("enter the monthly salary:");
	int salary=sc.nextInt();
	int yearlysalary= salary*12;
System.out.println("Hi"+name+"! your employee id is"+no+", monthly salary is RS"+salary+"and yearly salary is rs"+yearlysalary);
sc.close();	
	}

}
