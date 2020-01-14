package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
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
    private List<Apartment> ownedApartments;

    @ManyToOne
    private Reservation reservation;



}


