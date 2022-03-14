package com.swap;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of X ");
		x=sc.nextInt();
		if(x%8==0)
			System.out.println("Divisible by 8");
		else 
			System.out.println("Not divisible by 8");
			

}
}
