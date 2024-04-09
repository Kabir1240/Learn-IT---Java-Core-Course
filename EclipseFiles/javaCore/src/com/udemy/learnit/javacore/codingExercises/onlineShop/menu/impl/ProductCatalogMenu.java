package com.udemy.learnit.javacore.codingExercises.onlineShop.menu.impl;

import com.udemy.learnit.javacore.codingExercises.onlineShop.configs.ApplicationContext;
import com.udemy.learnit.javacore.codingExercises.onlineShop.menu.Menu;
import com.udemy.learnit.javacore.codingExercises.onlineShop.services.ProductManagementService;
import com.udemy.learnit.javacore.codingExercises.onlineShop.services.impl.DefaultProductManagementService;

public class ProductCatalogMenu implements Menu {

	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context;
	private ProductManagementService productManagementService;

	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
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
