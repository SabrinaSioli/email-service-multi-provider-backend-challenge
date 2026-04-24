package com.sabrinasioli.email_service.application;

import com.sabrinasioli.email_service.adapters.EmailSenderGateway;
import com.sabrinasioli.email_service.core.cases.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {


    private EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService emailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        emailSenderGateway.sendEmail(to, subject, body);
    }
}
