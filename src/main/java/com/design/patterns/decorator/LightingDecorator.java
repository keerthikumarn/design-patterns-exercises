package com.design.patterns.decorator;

public class LightingDecorator extends HomeDecorator {

	@Override
	public void makeHouse() {
		super.makeHouse();
		System.out.println("Adding Lighting to the House.");
		addLighting();
	}

	private void addLighting() {
		System.out.println("I am adding lighting fixtures to the house.");
	}
}
