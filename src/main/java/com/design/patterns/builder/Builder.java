package com.design.patterns.builder;

public interface Builder {

	void buildBody();
	void addWheels();
	void addHeadlights();
	void startOperations();
	void endOperations();
	Product getVehicle();
	
}
