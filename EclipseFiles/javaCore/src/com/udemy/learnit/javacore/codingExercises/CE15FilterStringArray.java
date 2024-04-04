package com.udemy.learnit.javacore.codingExercises;
import java.util.Scanner;
import java.util.Arrays;

public class CE15FilterStringArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		int numberOfMinWords = 0;
		for (int i = 0; i < words.length; i++) 
		{
			if (words[i].length() >= minLength) 
			{
				numberOfMinWords ++;
			}
		}
		
		String[] filteredWords = new String[numberOfMinWords];
		int counter = 0;
		for (int i = 0; i < words.length; i++) 
		{
			if (words[i].length() >= minLength) 
			{
				filteredWords[counter] = words[i];
				counter++;
			}
		}
		return filteredWords;
	}
}
