package com.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class FitnessData implements FitnessInterface {

	private int steps;
	private int caloriesBurned;
	private int activeMinutes;

	private List<FitnessDataObserver> observers = new ArrayList<>();

	@Override
	public void registerObserver(FitnessDataObserver obj) {
		observers.add(obj);
	}

	@Override
	public void removeObserver(FitnessDataObserver obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		for (FitnessDataObserver observer : observers) {
			observer.update(this);
		}
	}

	public void newFitnessDataPushed(int steps, int activeMinutes, int calories) {
		this.steps = steps;
		this.activeMinutes = activeMinutes;
		this.caloriesBurned = calories;
		System.out.println("\nFitnessData: New data received — Steps: " + steps + ", Active Minutes: " 
		+ activeMinutes + ", Calories: " + calories);
		notifyObservers();
	}

	public void dailyReset() {
		this.steps = 0;
		this.activeMinutes = 0;
		this.caloriesBurned = 0;
		System.out.println("\nFitnessData: Daily reset performed.");
		notifyObservers();
	}

	public int getSteps() {
		return steps;
	}

	public int getActiveMinutes() {
		return activeMinutes;
	}

	public int getCalories() {
		return caloriesBurned;
	}

}
