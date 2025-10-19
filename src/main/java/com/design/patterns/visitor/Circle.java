package com.design.patterns.visitor;

public class Circle implements Shape {

	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visitCircle(this);
	}

	public double getRadius() {
		return radius;
	}

}
