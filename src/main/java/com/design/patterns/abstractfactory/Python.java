package com.design.patterns.abstractfactory;

public class Python implements Snake {

	@Override
	public void speak() {
		System.out.println("Hiss! I am a Python.");
	}

	@Override
	public void performAction() {
		System.out.println("The Python is constricting its prey.");
	}

}
