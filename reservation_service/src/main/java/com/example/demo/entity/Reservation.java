package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Apartment apartment;

    @OneToMany
    private List<User> users;

    private Date startTimeOfReservation;

    private Date endTimeOfReservation;


//    some other entities

}
