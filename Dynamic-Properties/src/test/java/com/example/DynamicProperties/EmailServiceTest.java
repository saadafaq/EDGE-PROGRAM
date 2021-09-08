package com.example.DynamicProperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@AutoConfigureMockMvc
class EmailServiceTest {

    @Autowired
    EmailService emailService;

    @Test
    void sendEmail() {
        assertEquals(HttpStatus.OK.value(),emailService.sendEmail());
    }
}