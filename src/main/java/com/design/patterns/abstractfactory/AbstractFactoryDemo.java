package com.design.patterns.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AnimalFactory wildAnimalFactory = new WildAnimalFactory();
		AnimalFactory petAnimalFactory = new PetAnimalFactory();

		Lion africanLion = wildAnimalFactory.createLion();
		Snake africanSnake = wildAnimalFactory.createSnake();

		Lion indianLion = petAnimalFactory.createLion();
		Snake indianSnake = wildAnimalFactory.createSnake();

		africanLion.speak();
		africanSnake.performAction();
		indianLion.speak();
		indianSnake.performAction();
	}

}