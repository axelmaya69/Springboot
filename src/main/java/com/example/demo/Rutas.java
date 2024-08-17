package com.example.demo;

import com.example.demo.models.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class Rutas {


    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

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

    //manejo de estados
    @GetMapping("/saludar")
    @ResponseStatus(value = HttpStatus.OK)//en postman aparece OK
    String segundaRuta(){
    return "";
    }

    @GetMapping("/saludar1")
    @ResponseStatus(value = HttpStatus.MOVED_PERMANENTLY, reason = "Movida a la version 2.0")
        //para decir que no esta disponible
    String terceraRuta(){
        return "";
    }
    @GetMapping("/animales/{lugar}")
    public ResponseEntity <String> getAimales(@PathVariable String lugar) {
        if (lugar.equals("granja")) {
            return ResponseEntity.status(HttpStatus.OK).body("caballo, perro gato, vaca");//si es correcto devuelve ok
        } else if (lugar.equals("selva")) {
            return ResponseEntity.status(HttpStatus.OK).body("vibora, chango, guacamaya");//si es correcto devuelve ok
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Lugar no valido");//si no es correcto devuelve mal
        }
    }
        @GetMapping("/calcular/{numero}")
                public int getCalculo(@PathVariable int numero){
            throw new NullPointerException("excepcion ocurrida debido a lorem");
        }
    }

