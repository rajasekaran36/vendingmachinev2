package com.kgisl.raja.vendingmachine.products;
import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.model.Preparation;



public class HotMilk implements Product{
    private Preparation prep;
    private Customization cust;
    public HotMilk(Customization cust){
        this.cust = cust;
        prep = new Preparation();
    }
    public void make(){
        Double mugSize = cust.getMugSize();
        prep.setMilk(mugSize*1.0);
        System.out.println("HotMilk Ready:\n Cup contains:\n"+prep.toString());
    }
}