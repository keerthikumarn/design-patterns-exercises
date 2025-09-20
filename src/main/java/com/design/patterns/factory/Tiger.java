package com.design.patterns.factory;

public class Tiger implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Hukum... Tiger ka hukum !!");
	}

	@Override
	public void performAction() {
		System.out.println("Attacking its prey");
	}
}
