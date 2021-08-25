package com.example.BuldDataLoading.Property;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class PropertyService {
    private Properties properties = new Properties();
    private ProperyRepository properyRepository;

    final static String propertyFileName = "application.properties";


    @Autowired
    public PropertyService(ProperyRepository properyRepository) {
        this.properyRepository = properyRepository;
    }

    public int loadPropertiesToDatabase() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(propertyFileName);

            properties.load(inputStream);

            Iterator<?> it = properties.propertyNames().asIterator();

            ArrayList<com.example.BuldDataLoading.Property.model.Property> propertiesArray = new ArrayList<>();
            List<com.example.BuldDataLoading.Property.model.Property> properyRepositoryAll = properyRepository.findAll();

            while (it.hasNext()) {
                com.example.BuldDataLoading.Property.model.Property property = new com.example.BuldDataLoading.Property.model.Property();
                property.setPropertyName((String) it.next());
                property.setValue(properties.getProperty(property.getPropertyName()));
                propertiesArray.add(property);

                if (properyRepositoryAll != null && properyRepositoryAll.size() > 0) {
                    for (var prop : properyRepositoryAll) {
                        if (prop.getPropertyName().equals(property.getPropertyName())) {
                            property.setId(prop.getId());
                        }
                    }
                }
            }

            properyRepository.saveAll(propertiesArray);

            return HttpStatus.SC_OK;
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("File not fround");

            return HttpStatus.SC_EXPECTATION_FAILED;
        }
        catch (Exception e){
            return HttpStatus.SC_EXPECTATION_FAILED;
        }
    }

}
