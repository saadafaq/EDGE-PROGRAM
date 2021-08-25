package com.example.BuldDataLoading.Property.model;

import javax.persistence.*;


@Entity
@Table
public class Property {
    @Id
    @SequenceGenerator(name = "properties_sequence",
            allocationSize = 1,
            sequenceName = "properties_sequence"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "properties_sequence")
    private Long id;
    private String propertyName;
    private String value;


    public Property() {
    }

    public Property(Long id, String propertyName, String value) {
        this.id = id;
        this.propertyName = propertyName;
        this.value = value;
    }

    public Property(String propertyName, String value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
