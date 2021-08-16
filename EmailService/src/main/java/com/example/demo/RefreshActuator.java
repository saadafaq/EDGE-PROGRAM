package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;


@Aspect
@Component
public class RefreshActuator {

    private int refreshCount;
//    @Pointcut("execution(* java.util.Properties.getProperty(..))")
//    @Pointcut("execution(* org.springframework.beans.factory.annotation.Value(..))")
//    @Pointcut("execution(* com.example.demo.ValueRefreshConfigBean.getColor())")
//    @Pointcut("execution(* com.example.demo.ValueRefreshConfigBean(..))")

    @Pointcut("execution(public String getColor())")
    private void selectGetName(){}
    final String uri = "http://localhost:8080/actuator/refresh";



    @Before("selectGetName()")
    public void refresh() throws IOException{
        refreshCount++;
        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(null);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.uri))
                .header("Content-Type", "application/json")
                .timeout(Duration.ofSeconds(1))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();


        HttpResponse<String> response;
        try {
            response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());

        }
        catch (Exception e){
//            e.printStackTrace();
        }
    }

//    @After("selectGetName()")
//    public void after(){
//        System.out.println("refreshCount: " +refreshCount);
//    }
}
