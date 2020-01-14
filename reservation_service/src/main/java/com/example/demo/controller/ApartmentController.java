package com.example.demo.controller;

import com.example.demo.entity.Apartment;
import com.example.demo.service.interfaces.ApartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {

    private ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping
    public List<Apartment> apartmentList(){
        return this.apartmentService.findAll();
    }

}