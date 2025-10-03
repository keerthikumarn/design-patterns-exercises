package com.design.patterns.facade;

public class RobotBody {

	public static void createRobot() {
		System.out.println("Refer this manual before creating a Robot");
	}

	public void createHands() {
		System.out.println("Robot Hands Created");
	}

	public void createRemainingParts() {
		System.out.println("Remaining parts (other than hands) are\n" + "created.");
	}

	public static void destroyRobot() {
		System.out.println(" Refer the manual before destroying of a robot.");
	}

	public void destroyHands() {
		System.out.println(" The robot's hands are destroyed.");
	}

	public void destroyRemainingParts() {
		System.out.println(" The robot's remaining parts are destroyed.");
	}
}
