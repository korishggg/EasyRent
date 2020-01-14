package com.example.demo.controller;

import com.example.demo.entity.Apartment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {

    @GetMapping
    public String apartmentsPage(Model model){
        List<Apartment> apartments = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            apartments.add(new Apartment("City" +i, "Country " + i, "Address" + i, 1564 * i, "descr"+ 1 ));
        }

        model.addAttribute("apartments" , apartments);

        return "apartment/index";
    }

}