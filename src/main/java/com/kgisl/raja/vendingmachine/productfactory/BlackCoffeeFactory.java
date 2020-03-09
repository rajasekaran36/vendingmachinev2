package com.kgisl.raja.vendingmachine.productfactory;

import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.products.BlackCoffee;
import com.kgisl.raja.vendingmachine.products.Product;

public class BlackCoffeeFactory extends ProductFactory{
	@Override
	public Product getProduct(Customization cust) {
		return new BlackCoffee(cust);
	}
}