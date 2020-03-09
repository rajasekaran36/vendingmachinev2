package com.kgisl.raja.vendingmachine.productfactory;

import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.products.Lemonade;
import com.kgisl.raja.vendingmachine.products.Product;

public class LemonadeFactory extends ProductFactory{
	
	@Override
	public Product getProduct(Customization cust) {
		return new Lemonade(cust);
	}
}