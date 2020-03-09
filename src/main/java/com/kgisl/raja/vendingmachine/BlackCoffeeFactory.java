package com.kgisl.raja.vendingmachine;

import org.springframework.context.annotation.Bean;

public class BlackCoffeeFactory extends ProductFactory{
	@Override
	public Product getProduct(Customization cust) {
		return new BlackCoffee(cust);
	}
}