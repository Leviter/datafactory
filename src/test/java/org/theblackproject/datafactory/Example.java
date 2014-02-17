package org.theblackproject.datafactory;

import java.util.Locale;

public class Example {

	public static void main(String[] args) {
		DataFactory factory;

		System.out.println("=== NL ================");

		factory = new DataFactory(new Locale("nl", "NL"));

		System.out.println("--- full names --------");
		for (int i = 0; i < 10; i++) {
			System.out.println(factory.getFullName());
		}

		System.out.println("--- sentences ---------");
		for (int i = 0; i < 10; i++) {
			System.out.println(factory.getText());
		}

		System.out.println("--- domains -----------");
		for (int i = 0; i < 10; i++) {
			System.out.println(factory.getDomain());
		}

		System.out.println("=== DE ================");

		factory = new DataFactory(new Locale("de", "DE"));

		System.out.println("--- full names --------");
		for (int i = 0; i < 10; i++) {
			System.out.println(factory.getFullName());
		}

		System.out.println("--- sentences ---------");
		for (int i = 0; i < 10; i++) {
			System.out.println(factory.getText());
		}
	}
}
