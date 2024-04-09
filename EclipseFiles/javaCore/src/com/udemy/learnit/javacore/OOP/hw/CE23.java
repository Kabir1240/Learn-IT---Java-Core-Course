package com.udemy.learnit.javacore.OOP.hw;

import java.util.ArrayList;
import java.util.List;

public class CE23 {
	public static void main (String[] args) {
			Rectangle rectangle = new Rectangle (10, 15);
			Circle circle = new Circle(20);
			
			List<Shape> shapes = new ArrayList<>();
			shapes.add(rectangle);
			shapes.add(circle);
			
			ShapeCalculator shapeCalculator = new ShapeCalculator();
			System.out.println(shapeCalculator.calculateTotalArea(shapes));
		}

	}

