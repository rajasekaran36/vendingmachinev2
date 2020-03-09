package com.kgisl.raja.vendingmachine.products;
import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.model.Preparation;

import org.springframework.beans.factory.annotation.Autowired;




public class Cappuccino implements Product{
    @Autowired
    private Preparation preparation;
    
    private Customization cust;
    public Cappuccino(Customization cust){
        this.cust = cust;
        this.preparation = new Preparation();
    }
    public void make(){
        Double mugSize = cust.getMugSize();    
        preparation.setMilk(mugSize*0.5);
        preparation.setSugar(mugSize*0.2);
        preparation.setLiquidCoffee(mugSize*0.3);
        System.out.println("Cappuccino Ready:\n Cup contains:\n"+preparation.toString());

    }
}