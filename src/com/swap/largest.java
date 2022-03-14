package com.swap;

public class largest {
public static void main(String[] args) {
	int x=2,y=8,z=7;
	if(x>y && x>z)
		System.out.println(x+"is the largest number");

	else if(y>z && z>x) 
		System.out.println(y+ "is the largest number");

	else
		System.out.println(z+ "is the largest number");
}
}
