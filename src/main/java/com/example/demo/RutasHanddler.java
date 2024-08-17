package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;



//Clase para manejo de errores
//y evitar filtrar informacion sensible a los
//clientes

@RestControllerAdvice
public class RutasHanddler {

    private final Logger logger= LoggerFactory.getLogger(RutasHanddler.class);

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)

    public String handdleNullPointer(NullPointerException exception){
        logger.error(exception.getMessage());
        return "internal error";
    }

}
