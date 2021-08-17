package com.example.DynamicProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Autowired
    private EmailConfiguration emailConfiguration;

    public String sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailConfiguration.getFromEmail());
        message.setTo(emailConfiguration.getToEmail());
        message.setSubject(emailConfiguration.getSubject());
        message.setText(emailConfiguration.getContent());
        emailSender.send(message);

        return "[Fromemail : "+emailConfiguration.getFromEmail() +
                " ,"+ "toEmail:"+emailConfiguration.getToEmail()+"]";
    }

    public String testEmail(){
        return "[Fromemail : "+emailConfiguration.getFromEmail() +
                " ,"+ "toEmail:"+emailConfiguration.getToEmail()+"]";
    }
}
