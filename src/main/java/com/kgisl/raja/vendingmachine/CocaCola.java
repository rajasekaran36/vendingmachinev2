package com.kgisl.raja.vendingmachine;

public class CocaCola implements Product{
    private Preparation prep;
    private Customization cust;
    public CocaCola(Customization cust){
        this.cust = cust;
        prep = new Preparation();
    }
    public void make(){
        Double mugSize = cust.getMugSize();
        prep.setWater(mugSize*0.7);
        prep.setCoke(mugSize*0.3);
        System.out.println("CocaCola Ready:\n Cup contains:\n"+prep.toString());
    }
}