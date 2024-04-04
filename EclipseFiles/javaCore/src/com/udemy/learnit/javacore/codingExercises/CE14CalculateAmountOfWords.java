package com.udemy.learnit.javacore.codingExercises;
import java.util.Scanner;

public class CE14CalculateAmountOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String input = sc.nextLine();
		
		int amountOfWords = getWordsAmount(input);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		int wordsAmount = 0;
		char[] charArray = text.toCharArray();
		for (char e: charArray) 
		{
			if (e == ' ') 
			{
				wordsAmount += 1;
			}
		}
		wordsAmount ++;
		return wordsAmount;
	}
}
