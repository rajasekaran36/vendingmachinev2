package com.kgisl.raja.vendingmachine;

public class LemonadeFactory extends ProductFactory{
	
	@Override
	public Product getProduct(Customization cust) {
		return new Lemonade(cust);
	}
}