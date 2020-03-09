package com.kgisl.raja.vendingmachine.model;

import org.springframework.stereotype.Component;

@Component  
public class Customization{
    
    private Double extraMilk;
    private Double sugar;
    private Double mugSize;

    public Double getExtraMilk() {
        return this.extraMilk;
    }

    public void setExtraMilk(Double extraMilk) {
        this.extraMilk = extraMilk;
    }

    public Double getSugar() {
        return this.sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    public Double getMugSize() {
        return this.mugSize;
    }

    public void setMugSize(Double mugSize) {
        this.mugSize = mugSize;
    }

}