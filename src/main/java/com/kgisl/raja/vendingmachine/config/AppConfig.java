package com.kgisl.raja.vendingmachine.config;

import com.kgisl.raja.vendingmachine.model.Customization;
import com.kgisl.raja.vendingmachine.model.Preparation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kgisl.raja.vendingmachine.model")
public class AppConfig{
    
    @Bean
    public Customization customization(){
        return new Customization();
    }
    
    @Bean
    public Preparation preparation(){
        return new Preparation();
    }
}