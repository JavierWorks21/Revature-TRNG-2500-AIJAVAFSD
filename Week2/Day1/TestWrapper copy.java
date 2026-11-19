package com.day1;

public class TestWrapper {

	public static void main(String[] args) {
		Integer age = 20;
		Double price = 10.00;
		Character grade = 'A';
		Boolean active = true;

		System.out.println(age);
		System.out.println(price);
		System.out.println(grade);
		System.out.println(active);

		int x = 210;

		// auto boxing
		Integer y = x;
		System.out.println(y);

		// un-boxing converting from wrapper to primitive
		int z = 2;
		z = age.intValue();

		double p = price.doubleValue();
		System.out.println(p);

		String num = "200";
		int ammount = Integer.parseInt(num);

		System.out.println(ammount);


	}

}
