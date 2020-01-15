package com.example.demo.service.interfaces;

import com.example.demo.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    public void save(Reservation reservation);
    public void delete(Reservation reservation);
    void update(Reservation reservation);
    public Optional<Reservation> findById(Long id);
    List<Reservation> findAll();
}
