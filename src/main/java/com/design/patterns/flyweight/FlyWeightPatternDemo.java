package com.design.patterns.flyweight;

import java.util.Random;

public class FlyWeightPatternDemo {

	public static void main(String[] args) throws InterruptedException {
		RobotFactory robotFactory = new RobotFactory();
		System.out.println("\n***Flyweight Pattern Example ***\n");
		Robot myRobot;
		for (int i = 0; i < 3; i++) {
			myRobot = RobotFactory.getRobotFromFactory("small");
			Thread.sleep(1000);
			myRobot.showDetails(getRandomColor());
		}
		int numOfDistinctRobots = robotFactory.totalObjectsCreated();
		System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);
		for (int i = 0; i < 5; i++) {
			myRobot = RobotFactory.getRobotFromFactory("large");
			Thread.sleep(1000);
			myRobot.showDetails(getRandomColor());
		}
		numOfDistinctRobots = robotFactory.totalObjectsCreated();
		System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);
		for (int i = 0; i < 4; i++) {
			myRobot = RobotFactory.getRobotFromFactory("fixed");
			Thread.sleep(1000);
			myRobot.showDetails(getRandomColor());
		}
		numOfDistinctRobots = robotFactory.totalObjectsCreated();
		System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);
	}

	private static String getRandomColor() {
		Random r = new Random();
		int random = r.nextInt();
		if (random % 2 == 0) {
			return "red";
		} else {
			return "green";
		}
	}

}
