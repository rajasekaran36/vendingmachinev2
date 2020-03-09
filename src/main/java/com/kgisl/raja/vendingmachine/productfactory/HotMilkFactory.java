package com.kgisl.raja.vendingmachine.productfactory;

import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.products.HotMilk;
import com.kgisl.raja.vendingmachine.products.Product;

public class HotMilkFactory extends ProductFactory{
	
	@Override
	public Product getProduct(Customization cust) {
		return new HotMilk(cust);
	}
}