package com.microservice.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class TestApplication {

	@GetMapping("/bmdiagram")
	public String getMessage() {
		return "<!DOCTYPE html>\n" +
               "<html>\n" +
               "<head>\n" +
               "    <title>Test</title>\n" +
               "</head>\n" +
               "<body>\n" +
               "    <h1>Test de un Microservicio</h1>\n" +
               "    <p>Diagrama enfocado al modelo de negocio de <a href=\"https://drive.google.com/file/d/14cf-Q8gzXznjyd-PlnDDCqTGg_WTgrbB/view?usp=sharing\">Uber</a></p>\n" +
               "</body>\n" +
               "</html>";
    }

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
