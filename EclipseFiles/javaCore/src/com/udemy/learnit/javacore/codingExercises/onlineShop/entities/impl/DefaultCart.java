package com.udemy.learnit.javacore.codingExercises.onlineShop.entities.impl;

import com.udemy.learnit.javacore.codingExercises.onlineShop.entities.Cart;
import com.udemy.learnit.javacore.codingExercises.onlineShop.entities.Product;

public class DefaultCart implements Cart {

	// <write your code here>
	
	@Override
	public boolean isEmpty() {
		// <write your code here>
		
		return true;
	}

	@Override
	public void addProduct(Product product) {
		// <write your code here>
	}

	@Override
	public Product[] getProducts() {
		// <write your code here>
		
		return null;
	}

	@Override
	public void clear() {
		// <write your code here>
	}

}
