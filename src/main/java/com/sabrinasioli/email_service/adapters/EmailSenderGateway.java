package com.sabrinasioli.email_service.adapters;

import org.springframework.stereotype.Component;

@Component
public interface EmailSenderGateway {

    public void sendEmail(String to, String subject, String body);

}
