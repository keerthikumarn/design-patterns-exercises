package com.design.patterns.builder;

public class Truck implements Builder {

	private String brandName;
	private Product product;
	
	public Truck(String brandName) {
		this.brandName = brandName;
		this.product = new Product();
	}

	@Override
	public void buildBody() {
		product.addPart("This is a body of a Truck");
	}

	@Override
	public void addWheels() {
		product.addPart("8 wheels are added");
	}

	@Override
	public void addHeadlights() {
		product.addPart("4 headlights are added");
	}

	@Override
	public void startOperations() {
		product.addPart(String.format("Truck model is :%s", this.brandName));
	}

	@Override
	public void endOperations() {
		product.addPart(String.format("Truck model is :%s", this.brandName));
	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
