package com.design.patterns.decorator;

public class WallDecorator extends HomeDecorator {
	
	@Override
	public void makeHouse() {
		super.makeHouse();
		System.out.println("Adding Wall to the House.");
		decorateWall();
	}

	private void decorateWall() {
		System.out.println("I am making an additional decorating designer wall on the house.");
	}

}
