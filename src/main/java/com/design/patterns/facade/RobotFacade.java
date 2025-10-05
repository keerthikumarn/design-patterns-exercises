package com.design.patterns.facade;

public class RobotFacade {

	RobotColor robotColor;
	RobotHands robotHands;
	RobotBody robotBody;

	public RobotFacade() {
		robotColor = new RobotColor();
		robotHands = new RobotHands();
		robotBody = new RobotBody();
	}

	public void constructMilanoRobot() {
		RobotBody.createRobot();
		System.out.println("Creation of a Milano Robot Start.");
		robotColor.setDefaultColor();
		robotHands.setMilanoHands();
		robotBody.createHands();
		robotBody.createRemainingParts();
		System.out.println(" Milano Robot Creation End.");
		System.out.println();
	}

	public void constructRobonautRobot() {
		RobotBody.createRobot();
		System.out.println("Initiating the creational process of a Robonaut Robot.");
		robotColor.setColor("Green");
		robotHands.setRobonautHands();
		robotBody.createHands();
		robotBody.createRemainingParts();
		System.out.println("A Robonaut Robot is created.");
		System.out.println();
	}
	
	public void destoryMilanoRobot() {
		System.out.println("Initiating the destruction of a Milano Robot.");
		robotHands.resetMilanoHands();
		robotBody.destroyRemainingParts();
		RobotBody.destroyRobot();
		System.out.println("Milano Robot is destroyed.");
		System.out.println();
	}
	
	public void destoryRobonautRobot() {
		System.out.println("Initiating the destruction of a Robonaut Robot.");
		robotHands.resetRobonautHands();
		robotBody.destroyRemainingParts();
		RobotBody.destroyRobot();
		System.out.println("Robonaut Robot is destroyed.");
		System.out.println();
	}

}
