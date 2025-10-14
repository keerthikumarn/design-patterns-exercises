package com.design.patterns.observer;

public class GoalNotifier implements FitnessDataObserver {

	private final int stepGoal = 10000;
	private boolean goalReached = false;

	@Override
	public void update(FitnessData data) {
		if (data.getSteps() >= stepGoal && !goalReached) {
			goalReached = true;
			System.out
					.println("GoalNotifier: Congratulations! You've reached your step goal of " + stepGoal + " steps!");
		} else if (data.getSteps() < stepGoal && goalReached) {
			goalReached = false;
		}
	}

	public void reset() {
		goalReached = false;
	}

}
