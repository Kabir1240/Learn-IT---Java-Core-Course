package com.udemy.learnit.javacore.codingExercises;
import java.util.Scanner;

public class CodingExercise3 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double radius, circleCircumference;
		System.out.print("Please, enter circle radius: ");
        radius = sc.nextDouble();
        circleCircumference = 2 * Math.PI * radius;

		System.out.println("Circle circumference is: " + circleCircumference);
	}
}
