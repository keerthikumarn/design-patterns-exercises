package com.design.patterns.abstractfactory;

import com.design.patterns.abstractfactory.AnimalFactory;
import com.design.patterns.abstractfactory.AsianLion;
import com.design.patterns.abstractfactory.Lion;
import com.design.patterns.abstractfactory.Python;
import com.design.patterns.abstractfactory.Snake;

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
