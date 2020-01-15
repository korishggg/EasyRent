package com.example.demo.service.interfaces;

import com.example.demo.entity.Apartment;

import java.util.List;
import java.util.Optional;

public interface ApartmentService {
    public void save(Apartment apartment);
    public void delete(Apartment apartment);
    public Optional<Apartment> findById(Long id);
    List<Apartment> findAll();
    void update(Apartment apartment);
}
