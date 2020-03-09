package com.kgisl.raja.vendingmachine;


import com.kgisl.raja.vendingmachine.config.AppConfig;
import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.productfactory.ProductFactory;
import com.kgisl.raja.vendingmachine.productfactory.ProductFactory.ProductType;
import com.kgisl.raja.vendingmachine.products.Product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class VendingmachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendingmachineApplication.class, args);
		
		Customization cust=new Customization();
		cust.setMugSize(1000.0);
		System.out.println("\n\n\n");
		Product pro1 = ProductFactory.getProductFactory(ProductType.CAPPUCCINO).getProduct(cust);
		pro1.make();

		Product pro2 = ProductFactory.getProductFactory(ProductType.BLACKCOFFEE).getProduct(cust);
		pro2.make();

		Product pro3 = ProductFactory.getProductFactory(ProductType.LEMONADE).getProduct(cust);
		pro3.make();

		Product pro4 = ProductFactory.getProductFactory(ProductType.HOTMILK).getProduct(cust);
		pro4.make();
		
		Product pro5 = ProductFactory.getProductFactory(ProductType.COCOCOLA).getProduct(cust);
		pro5.make();

		System.out.println("\n\n\n");
	}

}
