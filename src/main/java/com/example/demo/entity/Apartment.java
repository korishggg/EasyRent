package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Apartment {
    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String country;

    private String address;

    private Integer price;

    private String description;

    private Boolean isBooked;

    @ManyToOne
    private User user;

    public Apartment(String city, String country, String address, Integer price, String description) {
        this.city = city;
        this.country = country;
        this.address = address;
        this.price = price;
        this.description = description;
        this.isBooked = false;
    }

    //    private User owner;


}