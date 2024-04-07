package com.udemy.learnit.javacore.OOP.typesOfClasses;

public class VariantProduct extends Product {
	
	private MasterProduct[] variants;

	@Override
	public boolean isAvailableInStock() {
		for (MasterProduct masterProduct : variants) {
			if (masterProduct.isAvailableInStock()) {
				return true;
			}
		}
		return false;
	}

}
