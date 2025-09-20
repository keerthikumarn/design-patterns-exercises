package com.design.patterns.factory;

public class ElephantFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Elephant();
	}

}
