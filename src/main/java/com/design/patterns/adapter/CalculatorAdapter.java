package com.design.patterns.adapter;

public class CalculatorAdapter {

	public double getArea(Triangle triangle){
		Calculator calculator = new Calculator();
		Rectangle rect = new Rectangle();
		rect.length = triangle.base;
		rect.width = 0.5 * triangle.height;
		return calculator.computeArea(rect);
	  }
}
