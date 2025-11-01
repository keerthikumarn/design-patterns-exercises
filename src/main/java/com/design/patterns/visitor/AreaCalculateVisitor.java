package com.design.patterns.visitor;

public class AreaCalculateVisitor implements ShapeVisitor {

	@Override
	public void visitCircle(Circle circle) {
		double area = Math.PI * circle.getRadius() * circle.getRadius();
		System.out.println("Area of Circle: " + area);
	}

	@Override
	public void visitSquare(Square square) {
		 double area = square.getBreadth() * square.getLength();
	     System.out.println("Area of Rectangle: " + area);
	}

}
