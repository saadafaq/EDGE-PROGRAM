package com.example.DynamicProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "email")
public class EmailController {
    @Autowired
    EmailService emailService;
    
    @GetMapping
    public String sendEmail(){
        return emailService.sendEmail();
    }

    @GetMapping(path = "test")
    public String testEmail(){
        return emailService.testEmail();
    }
}
