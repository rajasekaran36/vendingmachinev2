package com.kgisl.raja.vendingmachine;



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