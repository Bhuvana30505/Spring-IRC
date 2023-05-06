package com.example.Kabbadi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
  title = "Kabbadi",
  version = "1.1.2",
 description = "Kabbadi match"
 		+ "",
  contact = @Contact(
      name = "MaX",
      email = "kratos@max.io"
      )
  )
)
public class Kabbadi1Application {

	public static void main(String[] args) {
		SpringApplication.run(Kabbadi1Application.class, args);
	}

}
