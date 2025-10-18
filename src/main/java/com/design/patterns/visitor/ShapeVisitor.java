package com.design.patterns.visitor;

public interface ShapeVisitor {

	void visitCircle(Circle circle);

	void visitSquare(Square square);

}
