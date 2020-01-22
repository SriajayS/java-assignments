package com.nubes.cj.basics;

import java.util.Scanner;

public class registration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
	
		System.out.println("enter the mobile number");
		int number=sc.nextInt();
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("congratulations "+name+"for your successful registration");
			}else {
				System.out.println("sorry! you need to be atleast 18years old to get membership");
			}
        sc.close();	
		}

}
