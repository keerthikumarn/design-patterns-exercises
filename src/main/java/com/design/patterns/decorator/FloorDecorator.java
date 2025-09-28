package com.design.patterns.decorator;

public class FloorDecorator extends HomeDecorator {
	
	@Override
	public void makeHouse() {
		super.makeHouse();
		System.out.println("Adding Floor to the House.");
		addFloor();
	}

	private void addFloor() {
		System.out.println("I am making an additional floor on top of it.");		
	}

}
