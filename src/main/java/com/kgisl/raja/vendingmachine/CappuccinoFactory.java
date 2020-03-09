package com.kgisl.raja.vendingmachine;

public class CappuccinoFactory extends ProductFactory{
	@Override
	public Product getProduct(Customization cust) {
		return new Cappuccino(cust);
}
}