package com.udemy.learnit.javacore.codingExercises;
import java.util.Scanner;

public class CE9PrintDigitsFromNewLine {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any integer: ");
		String input = sc.next();
		
		for (char e: input.toCharArray()) 
		{
			System.out.println(e);
		}
	}

}
