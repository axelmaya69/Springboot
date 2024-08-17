package com.example.demo;

import com.example.demo.models.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class Rutas {


    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class); //para los logs

    @GetMapping("/")
    String miPrimerRuta() {
        return "Hola mundo desde Springboot";
    }

    @GetMapping("book/{id}/editorial/{editorial}")
    String readBook(@PathVariable int id, @PathVariable String editorial) {
        return "Leyendo el libro: " + id + " con editorial " + editorial;

    }

    @GetMapping("book2/{id}")
    String readBooks(@PathVariable int id, @RequestParam String gato) {
        return "Leyendo el libro: " + id + " con editorial " + gato;
    }

    @PostMapping ("/libre")
        String guardarLibro(@RequestBody Libro libro) {
        logger.debug("libro {} editorial {} ",libro.nombre, libro.editorial);



        return "Libro Gruardado";

    }
}
