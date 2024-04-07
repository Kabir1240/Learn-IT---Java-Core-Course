package com.udemy.learnit.javacore.OOP.typesOfClasses;

public class MasterProduct extends Product {

	private boolean isAvailableForLease;

	@Override
	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0;
	}
}
