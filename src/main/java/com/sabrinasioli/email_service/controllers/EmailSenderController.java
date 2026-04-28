package com.sabrinasioli.email_service.controllers;

import com.sabrinasioli.email_service.application.EmailSenderService;
import com.sabrinasioli.email_service.core.cases.dto.EmailSenderDto;
import com.sabrinasioli.email_service.core.exceptions.EmailSenderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    private EmailSenderService emailSenderService;

    @Autowired
    public void emailSenderController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailSenderDto body)  {
        try {
            emailSenderService.sendEmail(body.to(), body.subject(), body.body());
            return ResponseEntity.ok("Email sent with successful");
        } catch (EmailSenderException exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email sending error");
        }
    }



}
