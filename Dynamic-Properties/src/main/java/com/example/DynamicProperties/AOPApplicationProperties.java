package com.example.DynamicProperties;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


@Aspect
@Component
public class AOPApplicationProperties {

    private static final String propertyFileName;

    private static Map<String,String> methodToEmailMap;

    static{
       methodToEmailMap = new HashMap<>();

       methodToEmailMap.put("getFromEmail","from.email");
       methodToEmailMap.put("getToEmail","to.email");
       methodToEmailMap.put("getSubject","email.subject");
       methodToEmailMap.put("getContent","email.content");

       propertyFileName = "application.properties";

    }

    @Pointcut("execution(* com.example.DynamicProperties.EmailConfiguration.*(..))")
    private void selectFromProperty(){}

    @Around("selectFromProperty()")
    private String getPropertyFromApplicationProperties(JoinPoint joinPoint){
        String propertyNameFromMethod = methodToEmailMap.get(joinPoint.getSignature().getName());
        if(joinPoint.getArgs().length == 1)
            return getProperty(joinPoint.getArgs()[0].toString());
        else if (propertyNameFromMethod != null)
            return getProperty(propertyNameFromMethod);

        return null;
    }


    public String getProperty(String key){
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(propertyFileName);

        String result = new BufferedReader(new InputStreamReader(inputStream))
                .lines().parallel().collect(Collectors.joining("\n"));

        Map<String, String> myMap = new HashMap<String, String>();
        String[] pairs = result.split("\n");

        for (int i=0;i<pairs.length;i++) {

            String pair = pairs[i];
            String[] keyValue = pair.split("=");

            if(keyValue.length == 2) {
                myMap.put(keyValue[0].strip(), keyValue[1].strip());
            }
        }

        return myMap.get(key);
    }

}
