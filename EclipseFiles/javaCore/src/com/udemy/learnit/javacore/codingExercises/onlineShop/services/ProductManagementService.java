package com.udemy.learnit.javacore.codingExercises.onlineShop.services;

import com.udemy.learnit.javacore.codingExercises.onlineShop.entities.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
