package com.udemy.learnit.javacore.codingExercises;
import java.util.Scanner;

public class CE18GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter two numbers separated by space: ");
		String userInput = sc.nextLine();
		
		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);

		System.out.println(gcdRecursive(number1, number2));
	}
//	
//	public static int gcdRecursive(int firstNumber, int secondNumber) {
//		int lowestCommonDivisor = 2;
//		while (!(firstNumber % lowestCommonDivisor == 0 && secondNumber % lowestCommonDivisor == 0)){
//			if (lowestCommonDivisor > firstNumber && lowestCommonDivisor > secondNumber) {
//				return 1;
//			}
//			lowestCommonDivisor++;
//		}
//		
//		if (firstNumber / lowestCommonDivisor == 1 && secondNumber / lowestCommonDivisor == 1) 
//		{
//			return 1;
//		}
//		
//		else {
//			return lowestCommonDivisor * gcdRecursive(firstNumber / lowestCommonDivisor, secondNumber / lowestCommonDivisor);
//		}
//	}
	
	// Better sollution from teacher.
	public static int gcdRecursive(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			//for the case firstNumber is negative
			return Math.abs(firstNumber); 
		} else {
			return gcdRecursive(secondNumber, firstNumber % secondNumber);
		}
		
	}
}
