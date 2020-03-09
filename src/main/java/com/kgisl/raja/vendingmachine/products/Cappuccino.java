package com.kgisl.raja.vendingmachine.products;
import com.kgisl.raja.vendingmachine.config.AppConfig;
import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.model.Preparation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cappuccino implements Product{
    private Customization cust;
    private Preparation preparation;
    AnnotationConfigApplicationContext ctx;
    public Cappuccino(Customization cust){
        ctx = new AnnotationConfigApplicationContext();
        this.cust = cust;
        ctx.register(AppConfig.class);
        preparation = ctx.getBean(Preparation.class);
    }
    public void make(){

        Double mugSize = cust.getMugSize();  
        preparation.setMilk(mugSize*0.5);
        preparation.setSugar(mugSize*0.2);
        preparation.setLiquidCoffee(mugSize*0.3);
        ctx.refresh();
        System.out.println("Cappuccino Ready:\n Cup contains:\n"+preparation.toString());

    }
}