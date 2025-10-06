package com.design.patterns.flyweight;

public class LargeRobot implements Robot {

	private final String robotTypeCreated;

	public LargeRobot() {
		robotTypeCreated = "Large Robot";
		System.out.println(robotTypeCreated + " created.");
	}

	@Override
	public void showDetails(String color) {
		System.out.print(" with " + color + " color");
	}

}
