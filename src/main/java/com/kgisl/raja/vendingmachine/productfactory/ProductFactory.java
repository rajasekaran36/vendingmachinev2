package com.kgisl.raja.vendingmachine.productfactory;

import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.products.Product;

public abstract class ProductFactory{
    public enum ProductType{
        CAPPUCCINO, BLACKCOFFEE, LEMONADE, HOTMILK,COCOCOLA
    }
    public abstract Product getProduct(Customization cust);
    public static ProductFactory getProductFactory(ProductType type){
        ProductFactory aFactory = null;
        switch(type){
            case CAPPUCCINO:
                aFactory = new CappuccinoFactory();
            break;

            case BLACKCOFFEE:
                aFactory = new BlackCoffeeFactory();
            break;

            case LEMONADE:
                aFactory = new LemonadeFactory();
            break;
            
            case HOTMILK:
                aFactory = new HotMilkFactory();
            break;
            
            case COCOCOLA:
                aFactory = new CocaColaFactory();
            break;

        }

        return aFactory;
    } 
}