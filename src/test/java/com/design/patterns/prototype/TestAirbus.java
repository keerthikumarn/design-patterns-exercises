package com.design.patterns.prototype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAirbus {
	private Airbus airbus;

	@BeforeEach
	void setUp() {
		airbus = new Airbus("A320");
	}

	@Test
	@DisplayName("Clone should create a new Airbus object with the same properties")
	void cloneShouldCreateNewAirbusWithSameProperties() throws CloneNotSupportedException {
		Airbus clonedAirbus = (Airbus) airbus.clone();
		assertNotSame(airbus, clonedAirbus);
		assertEquals(airbus.modelName, clonedAirbus.modelName);
		assertEquals(airbus.costInDollars, clonedAirbus.costInDollars);
	}

	@Test
	@DisplayName("Constructor should calculate cost correctly based on base price and additional cost")
	void constructorShouldCalculateCostCorrectly() {
	    int expectedCost = airbus.basePriceInDollars + airbus.costInDollars;
	    assertEquals(expectedCost, airbus.costInDollars);
	}

	@Test
	@DisplayName("Clone should throw CloneNotSupportedException if cloning is not supported")
	void cloneShouldThrowExceptionIfNotSupported() {
		BasicAircraft nonCloneableAircraft = new BasicAircraft() {
			@Override
			public BasicAircraft clone() throws CloneNotSupportedException {
				throw new CloneNotSupportedException("Cloning not supported");
			}
		};

		assertThrows(CloneNotSupportedException.class, nonCloneableAircraft::clone);
	}
}
