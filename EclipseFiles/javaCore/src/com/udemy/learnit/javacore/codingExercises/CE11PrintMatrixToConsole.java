package com.udemy.learnit.javacore.codingExercises;

public class CE11PrintMatrixToConsole {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		for (int[] arr: matrix)
		{
		    for (int i: arr) 
		    {
		    	System.out.print(i + " ");
		    }
		    System.out.println();
		}
	}

}
