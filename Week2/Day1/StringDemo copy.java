package com.day1;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Java"; // creates object reference in pool

		String s3 = new String("Hello"); //creates object in heap
		String s4 = "Hello";

		System.out.println(s1 == s4); // compares reference
		System.out.println(s1.equals(s4)); // compares values

		String name = "Alice";
		String newName = name.concat(" Maxine");

		System.out.println("New Name: " + newName);

		System.out.println(newName.length());

		String words = "Java,Python,C++,Java";

		System.out.println(words.replace("Java", "Sql"));
		System.out.println(words);

		String [] parts = words.split(",");

		for(int i = 0; parts.length > i; i ++) {
			System.out.println(parts[i]);
		}

		for(String part: parts) {
			System.out.println(part);
		}

		StringBuffer bf = new StringBuffer("Hello");

		bf.append(" Java!");

		System.out.println(bf);


		String s5 = new String("Hello");
		s5.concat(" java!");
		System.out.println(s5);

		StringBuilder sb = new StringBuilder("Hi");
		sb.append(" JAVA!");
		System.out.println(sb);



		String s6 = "     Hello    ";
		System.out.println(s6);

		String s7 = s6.trim();
		System.out.println(s7);

	}

}
