package com.kgisl.raja.vendingmachine;

public class Preparation{
    private Double milk;
    private Double water;
    private Double sugar;
    private Double coke;
    private Double liquidCoffee;
    private Double addedFlavour;
    private Double tea;


    public Double getMilk() {
        return this.milk;
    }

    public void setMilk(Double milk) {
        this.milk = milk;
    }

    public Double getWater() {
        return this.water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getSugar() {
        return this.sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    public Double getCoke() {
        return this.coke;
    }

    public void setCoke(Double coke) {
        this.coke = coke;
    }

    public Double getLiquidCoffee() {
        return this.liquidCoffee;
    }

    public void setLiquidCoffee(Double liquidCoffee) {
        this.liquidCoffee = liquidCoffee;
    }

    public Double getAddedFlavour() {
        return this.addedFlavour;
    }

    public void setAddedFlavour(Double addedFlavour) {
        this.addedFlavour = addedFlavour;
    }

    public Double getTea() {
        return this.tea;
    }

    public void setTea(Double tea) {
        this.tea = tea;
    }


    @Override
    public String toString() {
        return "{" +
            " milk='" + getMilk() + "'" +
            ", water='" + getWater() + "'" +
            ", sugar='" + getSugar() + "'" +
            ", coke='" + getCoke() + "'" +
            ", liquidCoffee='" + getLiquidCoffee() + "'" +
            ", addedFlavour='" + getAddedFlavour() + "'" +
            ", tea='" + getTea() + "'" +
            "}";
    }
    

}