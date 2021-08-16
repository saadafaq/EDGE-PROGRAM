package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Value("${from.email}")
    private String fromEmail;

    @Value("${from.email}")
    private String toEmail;

    @Value("${email.subject}")
    private String subject;

    @Value("${email.content}")
    private String content;

    public void sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(content);
        emailSender.send(message);
    }
}
