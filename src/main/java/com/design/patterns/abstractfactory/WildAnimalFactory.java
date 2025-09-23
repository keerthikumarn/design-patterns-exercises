package com.design.patterns.abstractfactory;

import com.design.patterns.abstractfactory.AfricanLion;
import com.design.patterns.abstractfactory.AnimalFactory;
import com.design.patterns.abstractfactory.KingCobra;
import com.design.patterns.abstractfactory.Lion;
import com.design.patterns.abstractfactory.Snake;

public class WildAnimalFactory implements AnimalFactory {

	@Override
	public Lion createLion() {
		return new AfricanLion();
	}

	@Override
	public Snake createSnake() {
		return new KingCobra();
	}

}
