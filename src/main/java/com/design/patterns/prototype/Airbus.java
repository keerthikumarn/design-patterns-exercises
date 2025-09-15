package com.design.patterns.prototype;

public class Airbus extends BasicAircraft {

	int basePriceInDollars = 500000;

	public Airbus(String modelName) {
		this.modelName = modelName;
		this.costInDollars = basePriceInDollars + setAdditionalCost();
	}
	
	public BasicAircraft clone() throws CloneNotSupportedException {
		return (Airbus) super.clone();
	}

}
