package com.udemy.learnit.javacore.string;
import java.util.Formatter;

public class StringFormatting {

	public static void main(String[] args) {
		System.out.println("===== String formatting =====");
		System.out.println();
		String firstName = "Andrii";
		
		String greetingsTemplate = "Hello, dear %s! Good %s!";
		
		String morning = "morning";
		String afternoon = "afternoon";
		String evening = "evening";
		// since greetings template only has 2 params, any more than that will be ignored. 
		// Any less will throw exception, runtime
		String formattedString = String.format(greetingsTemplate, firstName, morning);
		System.out.println(formattedString);
		
		System.out.printf("You have %d computers available at store\n", 10);
	}

}
