package com.udemy.learnit.javacore.misc;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt()); // 0 to 1
		System.out.println(r.nextInt(100)); // 0 to 99
		System.out.println(r.nextInt(100) + 1); // 1 to 100
		
		System.out.println(r.nextDouble());
	}

}
