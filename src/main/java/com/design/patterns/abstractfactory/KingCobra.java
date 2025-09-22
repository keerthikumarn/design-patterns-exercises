package com.design.patterns.abstractfactory;

public class KingCobra implements Snake {

	@Override
	public void speak() {
		System.out.println("Hiss! I am a King Cobra.");
	}

	@Override
	public void performAction() {
		System.out.println("The King Cobra is slithering through the jungle.");
	}

}
