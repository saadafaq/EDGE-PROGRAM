package com.example.DynamicProperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class EmailControllerIntegrationTest {

    @Autowired
    MockMvc mvc;

    @Test
    void sendEmail() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/email");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(HttpStatus.OK.value(),Integer.valueOf(result.getResponse().getContentAsString()));
    }
}