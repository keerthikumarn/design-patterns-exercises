package com.design.patterns.factory;

public class TigerFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Tiger();
	}

}
