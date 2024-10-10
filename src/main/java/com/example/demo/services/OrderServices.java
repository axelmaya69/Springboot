package com.example.demo.services;

import com.example.demo.models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Al implementar la notacion @Service le decimos a Springboot que esta clase es un servicio
//y este va a crear un objeto de esta clase y lo va a reutilizar en todas las clases donde se necesite con inyeccion de
//dependencias
public class OrderServices {


    public void saveOrder(List<Producto> productos){
        System.out.println("Guardando producto");
    }
}
