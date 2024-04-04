package com.udemy.learnit.javacore.codingExercises;

import java.util.Scanner;

public class CE10PyramidInConsole {

	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) 
		{
			System.out.println("*".repeat(i));
		}
		for (int i = input - 1; i >= 1; i--) 
		{
			System.out.println("*".repeat(i));
		}
	}

}
