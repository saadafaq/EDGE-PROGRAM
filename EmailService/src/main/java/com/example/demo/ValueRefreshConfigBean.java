package com.example.demo;

import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Properties;


@Component
@RefreshScope
public class ValueRefreshConfigBean {
    private String color;


    public ValueRefreshConfigBean(@Value("${application.theme.color}") String color) {
        this.color = color;
    }

    public String getColor() {
//        new Properties()
        return color;
    }
}
