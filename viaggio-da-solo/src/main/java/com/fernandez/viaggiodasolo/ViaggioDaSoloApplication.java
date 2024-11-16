package com.fernandez.viaggiodasolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ViaggioDaSoloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaggioDaSoloApplication.class, args);
	}

}
