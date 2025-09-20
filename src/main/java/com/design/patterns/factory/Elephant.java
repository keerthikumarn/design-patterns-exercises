package com.design.patterns.factory;

public class Elephant implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Trumpet");
	}

	@Override
	public void performAction() {
		System.out.println("Spraying water with trunk");
	}

}
