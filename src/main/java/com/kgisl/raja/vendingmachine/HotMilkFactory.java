package com.kgisl.raja.vendingmachine;

public class HotMilkFactory extends ProductFactory{
	
	@Override
	public Product getProduct(Customization cust) {
		return new HotMilk(cust);
	}
}