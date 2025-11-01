package com.design.patterns.visitor;

import java.util.List;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		List<Shape> shapes = List.of(new Circle(5), new Square(10, 4), new Circle(2.5));

		System.out.println("=== Calculating Areas ===");
		ShapeVisitor areaCalculator = new AreaCalculateVisitor();
		for (Shape shape : shapes) {
			shape.accept(areaCalculator);
		}

		System.out.println("\n=== Exporting to SVG ===");
		ShapeVisitor svgExporter = new ImageExporter();
		for (Shape shape : shapes) {
			shape.accept(svgExporter);
		}
	}

}
