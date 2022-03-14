package com.swap;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of X ");
		x=sc.nextInt();
		
if(x%2==0) 
	System.out.println("Even");
else
	System.out.println("Odd");

}
}
