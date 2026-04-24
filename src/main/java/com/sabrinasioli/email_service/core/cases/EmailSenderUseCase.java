package com.sabrinasioli.email_service.core.cases;

public interface EmailSenderUseCase {

    public void sendEmail(String to, String subject, String body);

}
