package com.design.patterns.decorator;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// Create the original house
		Component originalHouse = new ConcreteComponent();

		// Create decorators
		HomeDecorator floorDecorator = new FloorDecorator();
		HomeDecorator wallDecorator = new WallDecorator();
		HomeDecorator lightingDecorator = new LightingDecorator();

		// Set the original house to the lighting decorator
		lightingDecorator.setTheComponent(originalHouse);
		floorDecorator.setTheComponent(originalHouse);
		wallDecorator.setTheComponent(originalHouse);

		// Make the house with all decorators applied
		floorDecorator.makeHouse();
		wallDecorator.makeHouse();
		lightingDecorator.makeHouse();
	}

}
