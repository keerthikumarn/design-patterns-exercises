package com.design.patterns.builder;

public class Car implements Builder {

	private String brandName;
	private Product product;

	public Car(String brandName) {
		this.brandName = brandName;
		this.product = new Product();
	}

	@Override
	public void buildBody() {
		product.addPart("This is a body of a Car");
	}

	@Override
	public void addWheels() {
		product.addPart("4 wheels are added");
	}

	@Override
	public void addHeadlights() {
		product.addPart("2 headlights are added");
	}

	@Override
	public void startOperations() {
		product.addPart(String.format("Car model is :%s", this.brandName));
	}

	@Override
	public void endOperations() {
		//do nothing
	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
