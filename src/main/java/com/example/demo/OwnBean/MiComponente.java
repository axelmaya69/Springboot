package com.example.demo.OwnBean;

import org.springframework.stereotype.Component;
//Component Se usa para ordenar el codigo en cuanto a estetica/arquitectura

//Esta notacion tambien es un bean
@Component
public class MiComponente {
    public void saludadDesdeComponente(){
        System.out.println("Hola desde Mi Componente");
    }
}
