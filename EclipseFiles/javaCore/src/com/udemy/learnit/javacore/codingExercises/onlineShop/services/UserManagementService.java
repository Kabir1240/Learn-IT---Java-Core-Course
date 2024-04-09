package com.udemy.learnit.javacore.codingExercises.onlineShop.services;

import com.udemy.learnit.javacore.codingExercises.onlineShop.entities.User;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}
