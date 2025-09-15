package com.design.patterns.prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BasicAircraft airbus1 = new Airbus("Airbus A380");
		System.out.println("Aircraft Model: " + airbus1.getModelName() 
		+ " and Cost: $" + airbus1.getCostInDollars());

		BasicAircraft airbus2 = (Airbus) airbus1.clone();
		System.out.println("Aircraft Model: " + airbus2.getModelName() 
		+ " and Cost: $" + airbus2.getCostInDollars());

		BasicAircraft dreamLiner1 = new DreamLiner("Boeing 787 Dreamliner");
		System.out.println(
				"Aircraft Model: " + dreamLiner1.getModelName() + " and Cost: $" 
		+ dreamLiner1.getCostInDollars());

		BasicAircraft dreamLiner2 = (DreamLiner) dreamLiner1.clone();
		System.out.println(
				"Aircraft Model: " + dreamLiner2.getModelName() + " and Cost: $" 
		+ dreamLiner2.getCostInDollars());

	}

}
