package com.design.patterns.abstractfactory;

public class PetAnimalFactory implements AnimalFactory {

	@Override
	public Lion createLion() {
		return new AsianLion();
	}

	@Override
	public Snake createSnake() {
		return new Python();
	}

}
