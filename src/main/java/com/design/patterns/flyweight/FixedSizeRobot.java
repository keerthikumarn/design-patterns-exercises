package com.design.patterns.flyweight;

public class FixedSizeRobot implements Robot {

	private final String robotTypeCreated;

	public FixedSizeRobot() {
		robotTypeCreated = "Large Robot";
		System.out.println(robotTypeCreated + " created.");
	}

	@Override
	public void showDetails(String color) {
		System.out.print(" with " + " blue (default) color");
	}

}
