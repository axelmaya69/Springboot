package com.example.demo.OwnBean;


import com.example.demo.models.Producto;
import com.example.demo.services.IOrderService;
import com.example.demo.services.OrderServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

//contenedor de Beans
@Configuration //Declara que es una clase contenedora de Beans
public class PrimerosBeans {


    @Bean
    public MiBean crearMiBean(){
    return new MiBean();
    }

    @Bean
    public IOrderService instanciarOrderService(){
        boolean esProduccion= false;

        if(esProduccion){
            return new OrderServices();
        }{
            return new IOrderService() {
                @Override
                public void saveOrder(List<Producto> productos) {
                    System.out.println("Guardando en bd dammy local ");
                }
            };
        }

    }
}
