package com.kgisl.raja.vendingmachine;

public class CocaColaFactory extends ProductFactory{
	@Override
	public Product getProduct(Customization cust) {
		return new CocaCola(cust);
}
}