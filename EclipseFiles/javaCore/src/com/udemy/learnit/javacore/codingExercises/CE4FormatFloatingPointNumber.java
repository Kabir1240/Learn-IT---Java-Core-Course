package com.udemy.learnit.javacore.codingExercises;
import java.util.Formatter;

public class CE4FormatFloatingPointNumber {

	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		formatter.format("%.1f", Math.PI);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%.2f", Math.PI);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%.3f", Math.PI);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%.4f", Math.PI);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%.5f", Math.PI);
		System.out.println(formatter);
	}

}
