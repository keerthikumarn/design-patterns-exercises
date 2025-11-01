package com.design.patterns.visitor;

public class Square implements Shape {

	private final double length;
	private final double breadth;

	public Square(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visitSquare(this);
	}

}
