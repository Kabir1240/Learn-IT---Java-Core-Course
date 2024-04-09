package com.udemy.learnit.javacore.codingExercises.onlineShop.menu.impl;

import com.udemy.learnit.javacore.codingExercises.onlineShop.configs.ApplicationContext;
import com.udemy.learnit.javacore.codingExercises.onlineShop.menu.Menu;
import com.udemy.learnit.javacore.codingExercises.onlineShop.services.UserManagementService;
import com.udemy.learnit.javacore.codingExercises.onlineShop.services.impl.DefaultUserManagementService;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		// <write your code here>
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>	
	}

}
