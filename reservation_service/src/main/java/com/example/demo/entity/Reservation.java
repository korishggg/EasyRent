package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Reservation implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private Date startTimeOfReservation;

    private Date endTimeOfReservation;

    @ManyToMany
    private List<Apartment> apartments;

    @ManyToOne
    private User user;

    public Reservation(Date startTimeOfReservation, Date endTimeOfReservation, User user) {
        this.startTimeOfReservation = startTimeOfReservation;
        this.endTimeOfReservation = endTimeOfReservation;
        this.user = user;
        this.apartments = new ArrayList<>();
    }

    //    some other entities

}
