package com.design.patterns.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		System.out.println("***Factory Pattern Demo***\n");
		AnimalFactory tigerFactory = new TigerFactory();
		AnimalFactory elephantFactory = new ElephantFactory();
		Animal aTiger = tigerFactory.createAnimal();
		aTiger.makeSound();
		aTiger.performAction();
		Animal aDog = elephantFactory.createAnimal();
		aDog.makeSound();
		aDog.performAction();
	}

}
