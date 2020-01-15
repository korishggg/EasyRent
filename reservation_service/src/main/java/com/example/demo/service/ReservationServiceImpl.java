package com.example.demo.service;

import com.example.demo.db.ReservationRepository;
import com.example.demo.entity.Reservation;
import com.example.demo.service.interfaces.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void save(Reservation reservation) {
        this.reservationRepository.save(reservation);
    }

    @Override
    public void delete(Reservation reservation) {
        this.reservationRepository.delete(reservation);
    }

    @Override
    public void update(Reservation reservation) {

    }

    @Override
    public Optional<Reservation> findById(Long id) {
        return this.reservationRepository.findById(id);
    }

    @Override
    public List<Reservation> findAll() {
        return this.reservationRepository.findAll();
    }
}
