package com.ust;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		System.out.println("enter 2 number");
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
	
		int num2=sc.nextInt();
		
		
		System.out.println("enter operator");
		
		char op=sc.next().charAt(0);
		
		if(op=='+')
			System.out.println(num1+num2);
		else if(op=='-')
			System.out.println(num1-num2);
		else if(op=='*')
			System.out.println(num1*num2);
		else if(op=='/')
			System.out.println((float)num1/num2);
		else if(op=='%')
			System.out.println(num1/num2);
		else
			System.out.println("error");
			
			
	}
	

}
