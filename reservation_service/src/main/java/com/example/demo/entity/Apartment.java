package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Apartment implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String country;

    private String address;

    private Integer price;

    private String description;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Reservation> reservations;

    public Apartment(String city, String country, String address, Integer price, User user) {
        this.city = city;
        this.country = country;
        this.address = address;
        this.price = price;
        this.user = user;
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
    public void removeReservation(Reservation reservation) {
        this.reservations.remove(reservation);
    }
}