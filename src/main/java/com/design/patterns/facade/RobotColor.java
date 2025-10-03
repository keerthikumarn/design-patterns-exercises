package com.design.patterns.facade;

public class RobotColor {
	
	public void setDefaultColor() {
		System.out.println("Setting the robot to steel color");
	}
	
	public void setColor(String color) {
		System.out.println("Setting the robot color to: " + color);
	}

}
