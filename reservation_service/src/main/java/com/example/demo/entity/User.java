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
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
//    @NotNull
    private String firstName;

//    @NotNull
    private String lastName;

//    @NotNull
    private String email;

    @OneToMany
    private List<Apartment> apartments;

    @OneToMany
    private List<Reservation> reservations;

    private boolean isVerified;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.apartments = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addApartment(Apartment apartment){
        this.apartments.add(apartment);
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public void removeApartment(Apartment apartment){
        this.apartments.remove(apartment);
    }

    public void removeReservation(Reservation reservation) {
        this.reservations.remove(reservation);
    }
}


