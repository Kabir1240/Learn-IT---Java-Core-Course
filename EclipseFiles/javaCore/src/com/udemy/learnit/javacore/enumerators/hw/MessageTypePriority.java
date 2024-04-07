package com.udemy.learnit.javacore.enumerators.hw;
import java.util.Scanner;

public class MessageTypePriority {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();

			if (isValidMessageType(userInput)) {
				MessageType messageType = MessageType.valueOf("A");
				switch (userInput.toLowerCase()) {
				case "a":
					messageType = MessageType.A;
					break;
					
				case "b":
					messageType = MessageType.B;
					break;
					
				case "c":
					messageType = MessageType.C;
					break;
					
				case "d":
					messageType = MessageType.D;
					break;
				}
				System.out.println(messageType.getPriority());
				
			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}

		}

	}

	private static boolean isValidMessageType(String userInput) {
		switch (userInput.toLowerCase()) {
			case "a":
				return true;
				
			case "b":
				return true;
				
			case "c":
				return true;
				
			case "d":
				return true;
			
			default:
				return false;
		}
	}

}
