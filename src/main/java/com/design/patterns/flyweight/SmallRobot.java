package com.design.patterns.flyweight;

public class SmallRobot implements Robot {

	private final String robotTypeCreated;

	public SmallRobot() {
		robotTypeCreated = "Small Robot";
		System.out.println(robotTypeCreated + " created.");
	}

	@Override
	public void showDetails(String color) {
		System.out.print(" with " + color + " color");
	}

}
