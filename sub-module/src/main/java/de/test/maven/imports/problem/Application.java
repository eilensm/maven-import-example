package de.test.maven.imports.problem;

import de.test.maven.imports.problem.model.Person;

public class Application {

	public static void main(String[] args) {

		Person jimDoe = new Person("Jim", "Doe");
		System.out.println(jimDoe);
	}
}
