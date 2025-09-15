package com.design.patterns.prototype;

import java.util.Random;

public abstract class BasicAircraft implements Cloneable {

	public String modelName;
	public int costInDollars;

	public String getModelName() {
		return modelName;
	}

	public int getCostInDollars() {
		return costInDollars;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setCostInDollars(int costInDollars) {
		this.costInDollars = costInDollars;
	}

	public static int setAdditionalCost() {
		int cost = 0;
		Random randomNumber = new Random();
		cost = randomNumber.nextInt(1000);
		return cost;
	}

	public BasicAircraft clone() throws CloneNotSupportedException {
		return (BasicAircraft) super.clone();
	}

}
