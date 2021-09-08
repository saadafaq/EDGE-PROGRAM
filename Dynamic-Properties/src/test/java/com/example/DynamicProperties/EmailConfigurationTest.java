package com.example.DynamicProperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class EmailConfigurationTest {

    @Autowired
    EmailConfiguration emailConfiguration;

    @Test
    void getFromEmail() {
        assertEquals("saadafaq.97@gmail.com",emailConfiguration.getFromEmail());
    }

    @Test
    void getToEmail() {
        assertEquals("tahirhussain7929@gmail.com",emailConfiguration.getToEmail());

    }

    @Test
    void getSubject() {
        assertEquals("Spring Cloud Testing",emailConfiguration.getSubject());
    }

    @Test
    void getContent() {
        assertEquals("Hi from spring cloud",emailConfiguration.getContent());
    }
}