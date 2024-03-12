package com.udemy.learnit.javacore.math;

public class MathDemo {
	public static void main(String[] args) 
	{
		// You can type ctrl + shift + T to find any class like Math
		System.out.println(Math.PI);
		System.out.println(Math.max(3, 5)); // 5
		System.out.println(Math.min(3, 5)); // 3
		System.out.println(Math.sqrt(4)); // 2
		System.out.println(Math.abs(-5)); // 5
		
		System.out.println(Math.sqrt(-1)); // NaN -> Not a Number
		System.out.println(0/0.0); // NaN
		System.out.println((0/0.0) - 5); //NaN
		
		System.out.println(5/0.0); // Infinity. Because dividing by 0.0. just '0' would give exception
		System.out.println(-5/0.0); // -Infinity
		
		System.out.println(Math.round(20.0/3.0)); // 7
		System.out.println(Math.round(20.0 * 100.0 / 3.0)/ 100.0); //6.67
		
		System.out.println(Math.random()); // between 0.0 and 1.0
		System.out.println((int)(Math.random() * 100)); // between 0 and 100
		System.out.println((int)(Math.random()*100) + 100); // between 100 and 200
	}
}
