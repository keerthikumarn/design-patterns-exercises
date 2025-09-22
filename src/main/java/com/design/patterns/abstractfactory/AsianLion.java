package com.design.patterns.abstractfactory;

public class AsianLion implements Lion {

	@Override
	public void speak() {
		System.out.println("Roar! I am an Asian Lion.");
	}

	@Override
	public void performAction() {
		System.out.println("The Asian Lion is resting in the forest.");
	}

}
