package com.nubes.cj.basics;

import java. util.Scanner;
public class greater {
	public static int main(String[] args) {
	 Scanner sc  = new Scanner(System.in);
	System.out.println("enter the num");
	int num=sc.nextInt();
	int num=00;
int fact;
	if(num ==0||num==1) {
		return 1;
	}else {
	return  num*fact(num-1);
     }
sc.close();
	}
}