package com.avstechnologies.trackpodium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBoodAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoodAdminApplication.class, args);
	}

}
