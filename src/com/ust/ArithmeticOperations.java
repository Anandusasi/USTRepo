package com.ust;

public class ArithmeticOperations {
	public static void main(String[] args) {
		int num1,num2;
		num1=89;
		num2=56;
		System.out.println("add="+(num1+num2)); 
		System.out.println("sub="+(num1-num2));
		System.out.println("mult="+(num1*num2));
		System.out.println("div="+((float)num1/num2));
		
		
		short s=12;
		int i=s;//widening
		
		float f=i;//widening
		
		float f1=89.678f;
		i=(int)f1;//narrowing
		
		
		
	}
	

}
