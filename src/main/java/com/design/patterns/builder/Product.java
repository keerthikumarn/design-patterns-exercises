package com.design.patterns.builder;

import java.util.LinkedList;

public class Product {

	private LinkedList<String> parts;

	public Product() {
		parts = new LinkedList<String>();
	}

	public void addPart(String part) {
		parts.add(part);
	}

	public void showParts() {
		System.out.println("Product Parts: ");
		for (String part : parts) {
			System.out.println(part);
		}
	}

}
