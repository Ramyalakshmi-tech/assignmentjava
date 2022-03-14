package com.swap;
import java.util.*;

public class Smallest {
	public static  void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		  if(y<x) {
			  System.out.println(y);
		  }
		  else if(x<y) {
			  System.out.println(x);
		  }
	}

}
