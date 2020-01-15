package com.example.demo.service;

import com.example.demo.db.ApartmentRepository;
import com.example.demo.entity.Apartment;
import com.example.demo.service.interfaces.ApartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApartmentServiceImpl implements ApartmentService {

    private ApartmentRepository apartmentRepository;

    public ApartmentServiceImpl(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    @Override
    public void save(Apartment apartment) {
        this.apartmentRepository.save(apartment);
    }

    @Override
    public void delete(Apartment apartment) {
        this.apartmentRepository.delete(apartment);
    }

    @Override
    public Optional<Apartment> findById(Long id) {
        return this.apartmentRepository.findById(id);
    }

    @Override
    public List<Apartment> findAll() {
        return this.apartmentRepository.findAll();
    }

    @Override
    public void update(Apartment apartment) {
    }
}
