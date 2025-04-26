package com.ust;

import java.util.Scanner;

public class MaxOfNumbers {
public static void main(String[] args) {
	
//	int a=78,b=135;
//	int max=a>b?a:b;
//	System.out.println(max);
//	
//	int c=67;
//	max=a>b&&a>c?a:b>c?b:c;
//	System.out.println(max);
	
	int a,b,c,d,e;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a,b,c,d,e values");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	e=sc.nextInt();
	
//	int max=a>b?a:b;
//	System.out.println(max);
//	System.out.println("enter c value");
//	int c=sc.nextInt();	
	
//	int max= a>b?(a>c?(a>d?a:d):c>d?c:d):(b>c?(b>d?b:d):(c>d?c:d));
//	System.out.println("max of 4 num is:"+max);
	
	
	int max = a>b&&a>c&&a>d?a:(b>c&&b>d)?b:c>d?c:d;
	System.out.println("max of 4 num is:"+max);
	
	
	int max1 = a>b&&a>c&&a>d&&a>e?a:(b>c&&b>d&&b>e)?b:(c>d&&c>e)?c:(d>e)?d:e;
	System.out.println("max of 5 num is:"+max1);
}

}
