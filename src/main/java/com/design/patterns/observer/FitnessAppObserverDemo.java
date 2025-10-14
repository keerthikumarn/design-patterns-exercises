package com.design.patterns.observer;

public class FitnessAppObserverDemo {

	public static void main(String[] args) {
		FitnessData fitnessData = new FitnessData();

		LiveActivityDisplay display = new LiveActivityDisplay();
		ProgressLogger logger = new ProgressLogger();
		GoalNotifier notifier = new GoalNotifier();

		// Register observers
		fitnessData.registerObserver(display);
		fitnessData.registerObserver(logger);
		fitnessData.registerObserver(notifier);

		// Simulate updates
		fitnessData.newFitnessDataPushed(500, 5, 20);
		fitnessData.newFitnessDataPushed(9800, 85, 350);
		fitnessData.newFitnessDataPushed(10100, 90, 380);

		// Daily reset
		notifier.reset();
		fitnessData.dailyReset();
	}

}