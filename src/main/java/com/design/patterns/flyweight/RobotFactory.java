package com.design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

	private static Map<String, Robot> robotFactoryMap = new HashMap<>();

	public int totalObjectsCreated() {
		return robotFactoryMap.size();
	}

	public static synchronized Robot getRobotFromFactory(String robotType) {
		Robot robotCategory = robotFactoryMap.get(robotType);
		if (robotCategory == null) {
			switch (robotType) {
			case "small":
				System.out.println("We do not have small robot. Creating new small robot now.");
				robotCategory = new SmallRobot();
				break;
			case "large":
				System.out.println("We do not have large robot. Creating new large robot now.");
				robotCategory = new LargeRobot();
				break;
			case "fixed":
				System.out.println("We do not have large robot. Creating new large robot now.");
				robotCategory = new FixedSizeRobot();
				break;
			default:
				System.out.println("Robot Factory can create only small,large or fixed size robots.");
				throw new UnsupportedOperationException(
						"Robot Factory can create only small,large or fixed size robots.");
			}
			robotFactoryMap.put(robotType, robotCategory);
		}
		return robotCategory;
	}

}
