package com.design.patterns.visitor;

public class ImageExporter implements ShapeVisitor {

	@Override
    public void visitCircle(Circle circle) {
        System.out.println("<circle r=\"" + circle.getRadius() + "\" />");
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("<square length=\"" + square.getLength() +
                           "\" breadth=\"" + square.getBreadth() + "\" />");
    }

}
