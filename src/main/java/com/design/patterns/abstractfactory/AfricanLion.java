package com.design.patterns.abstractfactory;

public class AfricanLion implements Lion {

	@Override
	public void speak() {
		System.out.println("Roar! I am an African Lion.");
	}

	@Override
	public void performAction() {
		System.out.println("The African Lion is hunting in the savannah.");
	}

}
