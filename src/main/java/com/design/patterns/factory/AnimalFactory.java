package com.design.patterns.factory;

public abstract class AnimalFactory {
	
	public Animal makeAnimal() {
		System.out.println("I am inside makeAnimal() of AnimalFactory.You cannot ignore my rules.");
		Animal animal = createAnimal();
		animal.makeSound();
		animal.performAction();
		return animal;
	}

	public abstract Animal createAnimal();
}
