package com.design.patterns.flyweight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRobotFactory {

	private RobotFactory robotFactory;

	@BeforeEach
	void setUp() throws Exception {
		robotFactory = new RobotFactory();
	}

	@Test
	void createsNewSmallRobotWhenNotInFactory() {
		Robot robot = RobotFactory.getRobotFromFactory("small");
		assertNotNull(robot);
		assertTrue(robot instanceof SmallRobot);
	}

	@Test
	void createsNewLargeRobotWhenNotInFactory() {
		Robot robot = RobotFactory.getRobotFromFactory("large");
		assertNotNull(robot);
		assertTrue(robot instanceof LargeRobot);
	}

	@Test
	void createsNewFixedSizeRobotWhenNotInFactory() {
		Robot robot = RobotFactory.getRobotFromFactory("fixed");
		assertNotNull(robot);
		assertTrue(robot instanceof FixedSizeRobot);
	}

	@Test
	void throwsExceptionForUnsupportedRobotType() {
		assertThrows(UnsupportedOperationException.class, () -> RobotFactory.getRobotFromFactory("unknown"));
	}

	@Test
	void reusesExistingSmallRobotFromFactory() {
		Robot firstRobot = RobotFactory.getRobotFromFactory("small");
		Robot secondRobot = RobotFactory.getRobotFromFactory("small");
		assertSame(firstRobot, secondRobot);
	}

	@Test
	void reusesExistingLargeRobotFromFactory() {
		Robot firstRobot = RobotFactory.getRobotFromFactory("large");
		Robot secondRobot = RobotFactory.getRobotFromFactory("large");
		assertSame(firstRobot, secondRobot);
	}

	@Test
	void returnsCorrectTotalObjectsCreated() {
		RobotFactory.getRobotFromFactory("small");
		RobotFactory.getRobotFromFactory("large");
		RobotFactory.getRobotFromFactory("fixed");
		assertEquals(3, robotFactory.totalObjectsCreated());
	}

}
