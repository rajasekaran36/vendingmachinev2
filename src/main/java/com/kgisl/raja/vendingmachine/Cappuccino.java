package com.kgisl.raja.vendingmachine;

public class Cappuccino implements Product{
    private Preparation prep;
    private Customization cust;
    public Cappuccino(Customization cust){
        this.cust = cust;
        prep = new Preparation();
    }
    public void make(){
        Double mugSize = cust.getMugSize();    
        prep.setMilk(mugSize*0.5);
        prep.setSugar(mugSize*0.2);
        prep.setLiquidCoffee(mugSize*0.3);
        System.out.println("Cappuccino Ready:\n Cup contains:\n"+prep.toString());

    }
}