package com.design.patterns.prototype;

public class DreamLiner extends BasicAircraft {
	int basePriceInDollars = 350000;

	public DreamLiner(String modelName) {
		this.modelName = modelName;
		this.costInDollars = basePriceInDollars + setAdditionalCost();
	}

	public BasicAircraft clone() throws CloneNotSupportedException {
		return (DreamLiner) super.clone();
	}
}
