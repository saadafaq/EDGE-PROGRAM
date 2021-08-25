package com.example.BuldDataLoading.Property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PropertyController {

    private PropertyService PropertyService;

    @Autowired
    public PropertyController(PropertyService propertyService) {
        PropertyService = propertyService;
    }

    @RequestMapping(value="/load", method= RequestMethod.POST)
    public int loadProperties(){
        return PropertyService.loadPropertiesToDatabase();
    }
}
