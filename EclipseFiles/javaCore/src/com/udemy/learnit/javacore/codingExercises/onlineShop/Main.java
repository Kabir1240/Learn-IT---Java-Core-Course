package com.udemy.learnit.javacore.codingExercises.onlineShop;

import com.udemy.learnit.javacore.codingExercises.onlineShop.menu.Menu;
import com.udemy.learnit.javacore.codingExercises.onlineShop.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = (Menu) new MainMenu();
		mainMenu.start();
	}
	
}
