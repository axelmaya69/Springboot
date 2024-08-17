package com.example.demo;

import com.example.demo.models.Libro;
import com.example.demo.models.UserData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class Rutas {


    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

   @GetMapping("userData")
    public ResponseEntity<String> getUserData(){
       return  ResponseEntity
               .status(HttpStatus.OK)
               .header("Content-Type","application/json")
               .body("{\"name\":\"mary\"}") //respuesta jsons mala
               ;
   }
    //mejor forma de devolver jsons
   @GetMapping("/userDataV2")
   public Map<String, Map <String,Object>> getUserDataV2(){
        return Map.of("user", Map.of("name","Mary","age",25));
   }

    @GetMapping("/userDataV3")
    public UserData getUserDataV3(){
    return new UserData("mary",25);
    }

}
