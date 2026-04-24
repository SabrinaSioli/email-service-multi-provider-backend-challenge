package com.sabrinasioli.email_service.infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.sabrinasioli.email_service.adapters.EmailSenderGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailSenderGateway {

    private AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender sesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }


    @Override
    public void sendEmail(String to, String subject, String body) {
        SendEmailRequest sendEmailRequest = new SendEmailRequest()
                .withSource("sabrina.sioli00@gmail.com")
                        .withMessage(new Message()
                                .withSubject(new Content(subject))
                                .withBody(new Body(new Content(body))));

        amazonSimpleEmailService.sendEmail(sendEmailRequest);
    }
}
