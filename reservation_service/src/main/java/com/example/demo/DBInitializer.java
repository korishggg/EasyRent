package com.example.demo;

import com.example.demo.entity.Apartment;
import com.example.demo.entity.Reservation;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.ApartmentService;
import com.example.demo.service.interfaces.ReservationService;
import com.example.demo.service.interfaces.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DBInitializer implements CommandLineRunner {

    private UserService userService;
    private ApartmentService apartmentService;
    private ReservationService reservationService;

    public DBInitializer(UserService userService, ApartmentService apartmentService, ReservationService reservationService) {
        this.userService = userService;
        this.apartmentService = apartmentService;
        this.reservationService = reservationService;
    }

    @Override
    public void run(String... args) throws Exception {

        User user = new User("Korish", "John", "gg@mial.com");
        this.userService.save(user);

        Apartment apartment = new Apartment("Kiev", "UA", "Deh. 33s", 10000, user);
        this.apartmentService.save(apartment);

        Reservation reservation = new Reservation(new Date(), new Date(), user);
        this.reservationService.save(reservation);

    }
}