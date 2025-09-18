package com.design.patterns.builder;

public class BuilderManager {

	Builder builder;

	public void build(Builder builder) {
		this.builder = builder;
		this.builder.startOperations();
		this.builder.buildBody();
		this.builder.addWheels();
		this.builder.addHeadlights();
		this.builder.endOperations();
	}

}
