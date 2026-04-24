package com.sabrinasioli.email_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

	// use "clean architetura"
	// I will not create a object specif to email now because i will add no validation or business logic

	// packages that I will work
	// core -> EmailSenderUserCase
	// application -> EmailSenderService
	// adapters -> EmailSenderGateway -> interface to the sender emails providers
	// controllers -> emailSenderController
	// infra -> SesEmailSender -> concrete class to use aws ses


}
