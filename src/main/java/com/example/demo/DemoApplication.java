package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.debug("mi mensaje debug");
		logger.info("mi mensaje de info");
		logger.warn("mi mensaje de warning");
		logger.error("mi mensaje de error");


	}
//Comando para ejecutar desde terminal despues de entrar a la carpeta "demo": ./gradlew bootRun
	//@GetMapping obtener
}