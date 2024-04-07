package com.udemy.learnit.javacore.OOP.typesOfClasses;

import com.udemy.learnit.javacore.OOP.shopping.Cart;
import com.udemy.learnit.javacore.OOP.shopping.Cart.Discount;
import com.udemy.learnit.javacore.OOP.shopping.Cart.Tax;

public class Demo {

	public static void main(String[] args) {
		User user = new User();
		
//		// === init static nested class
		Tax tax = new Cart.Tax("someTaxType", 0);
//		
//		// === init inner class
		Discount discount = new Cart().new Discount("firstClientDiscount", 0);
		
		// === Abstract class demo
//		Product product = new Product(); // can't create instance of an abstract class
		MasterProduct masterProduct = new MasterProduct();
		VariantProduct variantProduct = new VariantProduct();
		
		masterProduct.setName("Mercedes S-klass");
		variantProduct.setDeliveryAvailable(true);
		
		// === Anonymous class demo
		Product product = new Product() {
			@Override
			public boolean isAvailableInStock() {
				return false;
			}
		};
		
	}
}
