package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
public class Apartment {
    @Id
    @GeneratedValue
    private Long id;

//    @NotNull
    private String city;
//    @NotNull
    private String country;
//    @NotNull
    private String address;

//    @NotNull
    private Integer price;

    private String description;

    private Boolean isBooked;

    @ManyToOne
    private User user;




    //    private User owner;


}