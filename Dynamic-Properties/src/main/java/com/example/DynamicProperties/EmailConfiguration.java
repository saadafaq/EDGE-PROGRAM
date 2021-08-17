package com.example.DynamicProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailConfiguration {
    @Value("${from.email}")
    private String fromEmail;

    @Value("${to.email}")
    private String toEmail;

    @Value("${email.subject}")
    private String subject;

    @Value("${email.content}")
    private String content;


    public String getFromEmail() {
        return fromEmail;
    }

    public String getToEmail() {
        return toEmail;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}
