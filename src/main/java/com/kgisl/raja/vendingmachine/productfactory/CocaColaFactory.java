package com.kgisl.raja.vendingmachine.productfactory;

import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.products.CocaCola;
import com.kgisl.raja.vendingmachine.products.Product;

public class CocaColaFactory extends ProductFactory{
	@Override
	public Product getProduct(Customization cust) {
		return new CocaCola(cust);
}
}