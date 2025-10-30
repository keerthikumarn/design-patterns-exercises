package com.design.patterns.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		System.out.println("***Facade Pattern Demo***\n");
		RobotFacade milanoRobotFacade = new RobotFacade();
		milanoRobotFacade.constructMilanoRobot();
		RobotFacade robonautRobotFacade = new RobotFacade();
		robonautRobotFacade.constructRobonautRobot();
		milanoRobotFacade.destoryMilanoRobot();
		robonautRobotFacade.destoryRobonautRobot();
	}

}
