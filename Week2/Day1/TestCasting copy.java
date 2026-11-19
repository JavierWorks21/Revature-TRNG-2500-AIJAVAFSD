package com.day1;

public class TestCasting {

	public static void main(String[] args) {

		int num = 100;
		double d = num;
		System.out.println("Widening Casting int to double " + d);

		double value = 9.87;
		int rounded = (int) value;
		System.out.println("Narrowing Casting double to int " + rounded);

		char c = 'A';
		int ascii = c;
		System.out.println("Char to int conversion " + ascii);
	}

}
