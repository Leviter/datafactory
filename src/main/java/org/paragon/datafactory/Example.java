package org.paragon.datafactory;

import java.util.Locale;

public class Example {

	public static void main(String[] args) {
		DataFactory factory;

		factory = new DataFactory(new Locale("nl", "NL"));

		for (int i = 0; i < 10; i++) {
			System.out.println(factory.getFullName());
		}

		factory = new DataFactory(new Locale("de", "DE"));

		for (int i = 0; i < 10; i++) {
			System.out.println(factory.getFullName());
		}
	}
}
