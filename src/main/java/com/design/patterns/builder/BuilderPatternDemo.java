package com.design.patterns.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		System.out.println("***Builder Pattern Demo***");
		BuilderManager manager = new BuilderManager();
		Builder fordCar = new Car("Ford");
		Builder hondaTruck = new Truck("Honda");
		manager.build(fordCar);
		Product p1 = fordCar.getVehicle();
		p1.showParts();
		manager.build(hondaTruck);
		Product p2 = hondaTruck.getVehicle();
		p2.showParts();
	}

}
