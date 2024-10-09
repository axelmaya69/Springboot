package com.example.demo.services;

import com.example.demo.models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Al implementar la notacion @Service le decimos a Springboot que esta clase es un servicio
public class OrderServices {


    public void saveOrder(List<Producto> productos){
        System.out.println("Guardando producto");
    }
}
