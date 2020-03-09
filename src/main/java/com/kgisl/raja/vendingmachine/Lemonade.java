package com.kgisl.raja.vendingmachine;

public class Lemonade implements Product{
    private Preparation prep;
    private Customization cust;
    public Lemonade(Customization cust){
        this.cust = cust;
        prep = new Preparation();
    }
    public void make(){
        Double mugSize = cust.getMugSize();
        prep.setWater(mugSize*0.6);
        prep.setSugar(mugSize*0.2);
        prep.setAddedFlavour(mugSize*0.2);
        System.out.println("Lemonade Ready:\n Cup contains:\n"+prep.toString());
    }
}