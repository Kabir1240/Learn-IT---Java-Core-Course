package com.udemy.learnit.javacore.codingExercises.onlineShop.menu.impl;

import com.udemy.learnit.javacore.codingExercises.onlineShop.configs.ApplicationContext;
import com.udemy.learnit.javacore.codingExercises.onlineShop.menu.Menu;
import com.udemy.learnit.javacore.codingExercises.onlineShop.services.OrderManagementService;
import com.udemy.learnit.javacore.codingExercises.onlineShop.services.impl.DefaultOrderManagementService;

public class MyOrdersMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;

	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
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
