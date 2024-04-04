package com.udemy.learnit.javacore.codingExercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CE20StringProcesser {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	
	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	
	public static String convert1(String input) {
		String[] inputArray = input.split("[;\\n]");
		String retVal = "";
		
		String emailPattern = "[a-zA-Z-\\d]+@[a-zA-Z-\\d]+\\.com";
		Pattern p = Pattern.compile(emailPattern);
		
		String namePattern = "^[a-zA-Z]+$";
		Pattern p1 = Pattern.compile(namePattern);
		Matcher m;
		for (int i = 3; i < inputArray.length; i++) {
			m = p1.matcher(inputArray[i]);
			if(m.find()) {
				retVal += m.group();
			}
			
			m = p.matcher(inputArray[i]);
			if(m.find()) {
				retVal += " ==> " + m.group() + System.lineSeparator();
			}
		}
		return retVal;
	}
	
	
	public static String convert2(String input) {
		String[] inputArray = input.split(";");
		String retVal = "";
		
		String emailPattern = "[a-zA-Z-\\d]+@[a-zA-Z-\\d]+\\.com";
		Pattern p = Pattern.compile(emailPattern);
		
		String namePattern = "[a-zA-Z]+ [a-zA-Z]+";
		Pattern p1 = Pattern.compile(namePattern);
		Matcher m;
		for (int i = 3; i < inputArray.length; i++) {
			m = p1.matcher(inputArray[i]);
			if(m.find()) {
				retVal += m.group();
			}
			
			m = p.matcher(inputArray[i]);
			if(m.find()) {
				retVal += " (email: " + m.group() + ")" + System.lineSeparator();
			}
		}
		return retVal;
	}
}
