package com.udemy.learnit.javacore.codingExercises;
import java.util.Scanner;

public class CE21FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		string = string.toLowerCase();
		String returnString = "";
		
		Boolean foundSpace = true;
		char[] charArray = string.toCharArray();
		for (char character : charArray) {
			if (Character.isWhitespace(character)) {
				returnString += character;
				foundSpace = true;
			}
			else if (!foundSpace) {
				returnString += character;
			}
			else {
				returnString += Character.toUpperCase(character);
				foundSpace = false;
			}
		}
		return returnString;
	}
}
