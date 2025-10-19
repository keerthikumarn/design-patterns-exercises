package com.design.patterns.visitor;

public interface Shape {

	void accept(ShapeVisitor visitor);

}
