package com.swap;
import java.util.*;

public class Swapping {
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of X and Y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping numbers:%d %d\n"+x+" "+y);
		z=x;
		x=y;
		y=z;
		System.out.println("After swapping"+x+" "+y);
		System.out.println();
		
	}

}
