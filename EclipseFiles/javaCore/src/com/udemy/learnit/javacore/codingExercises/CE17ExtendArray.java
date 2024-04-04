package com.udemy.learnit.javacore.codingExercises;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CE17ExtendArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLength = sc.nextInt();
		int[] arr = generateRandomArray(baseArrayLength);
		int[] extendedArray = extendArray(arr);
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extendedArray));
	}

	/**
	 * The method extends array.
	 * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
	 * is returned from this method.
	 * 
	 * @param arr - base of extension. Extended array contains elements from this array
	 * and additionally contains the same elements multiplied by two. 
	 * @return extended array.
	 */
	public static int[] extendArray(int[] arr) {
	    int amountOfElements = arr.length;
	    int[] newArray = new int[amountOfElements * 2];
	    for (int i = 0; i < amountOfElements; i++) {
			newArray[i] = arr[i];
		}
	    int j = 0;
	    for (int i = amountOfElements; i < amountOfElements*2; i++) {
	    	newArray[i] = arr[j] * 2;
	    	j ++;
	    }
	    return newArray;
	}

	public static int[] generateRandomArray(int amountOfElements) {
		int[] generatedArray = new int[amountOfElements];
		Random r = new Random();
		for (int i = 0; i < amountOfElements; i++) {
			generatedArray[i] = r.nextInt(100) + 1;
		}
		return generatedArray;
	}
}
