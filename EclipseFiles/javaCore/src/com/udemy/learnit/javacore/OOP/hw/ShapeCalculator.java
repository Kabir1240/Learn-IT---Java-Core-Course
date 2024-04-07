package com.udemy.learnit.javacore.OOP.hw;

import java.util.List;

public class ShapeCalculator {
	public double calculateTotalArea(List<Shape> shapes) {
	    double totalArea = 0d;
		for (Shape shape:shapes){
		    totalArea += shape.getArea();
		}
		return totalArea;
	}
}

