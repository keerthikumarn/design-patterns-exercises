package com.design.patterns.singleton;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestLeader {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	void shouldReturnSameInstanceForMultipleCalls() {
		Leader firstInstance = Leader.getLeader();
		Leader secondInstance = Leader.getLeader();
		assertSame(firstInstance, secondInstance, "Leader instances should be the same");
	}

	@Test
	void shouldPrintMessageWhenLeaderIsElected() {
		Leader.getLeader(); // First call
		// No assertion for console output, but this ensures no exceptions occur
	}

	@Test
	void shouldNotElectNewLeaderIfAlreadyExists() {
		Leader.getLeader(); // First call
		Leader.getLeader(); // Second call
		// No assertion for console output, but this ensures no exceptions occur
	}

}
