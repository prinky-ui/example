package org.demo.domain;

public class Logicdemo {

	public static void main(String[] args) {
		
		int a=110;  // False
		int b=111;
		int c=200;    // True
		
		System.out.println(a < b && a < c);// true
		System.out.println(a < b & a < c);
		

	}

}
