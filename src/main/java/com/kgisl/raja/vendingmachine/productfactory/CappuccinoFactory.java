package com.kgisl.raja.vendingmachine.productfactory;

import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.products.Cappuccino;
import com.kgisl.raja.vendingmachine.products.Product;

public class CappuccinoFactory extends ProductFactory{
	@Override
	public Product getProduct(Customization cust) {
		return new Cappuccino(cust);
}
}