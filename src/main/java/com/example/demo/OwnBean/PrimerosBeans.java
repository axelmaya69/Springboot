package com.example.demo.OwnBean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//contenedor de Beans
@Configuration //Declara que es una clase contenedora de Beans
public class PrimerosBeans {


    @Bean
    public MiBean crearMiBean(){
    return new MiBean();
    }
}
