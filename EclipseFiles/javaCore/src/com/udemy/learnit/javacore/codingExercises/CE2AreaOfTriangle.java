package com.udemy.learnit.javacore.codingExercises;
import java.util.Scanner;

public class CE2AreaOfTriangle {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double triangleArea, p, aSide, bSide, cSide;
		
		System.out.print("Please, enter A side of a triangle: ");
		aSide = sc.nextDouble();
		
		System.out.print("Please, enter B side of a triangle: ");
		bSide = sc.nextDouble();
		
		System.out.print("Please, enter C side of a triangle: ");
		cSide = sc.nextDouble();
		
		p = ((aSide+bSide+cSide)/2);
		triangleArea = Math.sqrt(p*(p-aSide)*(p-bSide)*(p-cSide));
		
		System.out.println("Triangle area is: " + triangleArea);
	}
}
