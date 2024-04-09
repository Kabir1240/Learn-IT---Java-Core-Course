package com.udemy.learnit.javacore.codingExercises.onlineShop.services;

import com.udemy.learnit.javacore.codingExercises.onlineShop.entities.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
