package com.ust;

import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	
	if(num%2==0)
		System.out.println("number is even");
	else
		System.out.println("number is odd");
	
	System.out.println(num%2==0?"even":"odd");
}
}
