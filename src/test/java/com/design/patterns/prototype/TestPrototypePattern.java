package com.design.patterns.prototype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrototypePattern {

	private DreamLiner dreamLiner;
	private Airbus airbus;

	@BeforeEach
	void setUp() {
		dreamLiner = new DreamLiner("DreamLiner 787");
		airbus = new Airbus("Airbus A380");
	}

	@Test
	void cloneShouldCreateExactCopyOfDreamLiner() throws CloneNotSupportedException {
		DreamLiner clonedDreamLiner = (DreamLiner) dreamLiner.clone();
		assertNotSame(dreamLiner, clonedDreamLiner);
		assertEquals(dreamLiner.getModelName(), clonedDreamLiner.getModelName());
		assertEquals(dreamLiner.getCostInDollars(), clonedDreamLiner.getCostInDollars());
	}

	@Test
	void cloneShouldCreateExactCopyOfAirbus() throws CloneNotSupportedException {
		Airbus clonedAirbus = (Airbus) airbus.clone();
		assertNotSame(airbus, clonedAirbus);
		assertEquals(airbus.getModelName(), clonedAirbus.getModelName());
		assertEquals(airbus.getCostInDollars(), clonedAirbus.getCostInDollars());
	}

	@Test
	void additionalCostShouldBeWithinExpectedRange() {
		int additionalCost = BasicAircraft.setAdditionalCost();
		assertTrue(additionalCost >= 0 && additionalCost < 1000);
	}

	@Test
	void dreamLinerCostShouldIncludeBasePriceAndAdditionalCost() {
		assertTrue(dreamLiner.getCostInDollars() >= 350000 && dreamLiner.getCostInDollars() < 351000);
	}

	@Test
	void airbusCostShouldIncludeBasePriceAndAdditionalCost() {
		assertTrue(airbus.getCostInDollars() >= 500000 && airbus.getCostInDollars() < 501000);
	}

}
