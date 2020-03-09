package com.kgisl.raja.vendingmachine.products;
import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.model.Preparation;

public class BlackCoffee implements Product{
    private Preparation prep;
    private Customization cust;
    public BlackCoffee(Customization cust){
        this.cust = cust;
        prep = new Preparation();
    }
    public void make(){
        Double mugSize = cust.getMugSize();
        prep.setWater(mugSize*0.5);
        prep.setLiquidCoffee(mugSize*0.5);
        System.out.println("BlackCoffee Ready:\n Cup contains:\n"+prep.toString());
    }
}