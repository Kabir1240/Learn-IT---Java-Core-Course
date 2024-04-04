package com.udemy.learnit.javacore.codingExercises;
import java.util.Arrays;
import java.util.Scanner;

public class CE12FindMaxIntInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		
		String userInput = sc.nextLine();
		String[] inputArgumentsArray = userInput.split("\\s+");
		
		int numberOfElements = inputArgumentsArray.length;
		int[] intArray = new int[numberOfElements];
	    for (int i = 0; i < numberOfElements; i++) {
	    	intArray[i] = Integer.parseInt(inputArgumentsArray[i]);
	    }
	    
	    int maxInt = findMaxIntInArray(intArray);
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int max = 0;
		for (int i: intArray) 
		{
		    if (i > max) 
		    {
		        max = i;
		    }
		}
		return max;
	}

}
