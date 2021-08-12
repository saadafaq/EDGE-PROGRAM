package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;


@RestController
@RequestMapping(path = "demo")
public class DemoController extends Properties {
    @Autowired
    ValueRefreshConfigBean valueRefreshConfigBean;

    @Autowired
    EmailServiceImpl emailService;

   @GetMapping
    public String getColor(){
       return valueRefreshConfigBean.getColor();
   }

   @PostMapping(path = "/sendEmail")
    public void sendEmail(){
        emailService.sendEmail();
   }
}
