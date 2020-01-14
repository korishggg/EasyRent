package com.example.demo;

import com.example.demo.entity.Apartment;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.ApartmentService;
import com.example.demo.service.interfaces.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private ApartmentService apartmentService;
    private UserService userService;

    public DemoApplication(ApartmentService apartmentService, UserService userService) {
        this.apartmentService = apartmentService;
        this.userService = userService;
    }

    @Bean
    public CommandLineRunner commandLineRunner (){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                userService.save(new User());
                for (int i = 0; i < 3; i++) {
                    apartmentService.save(new Apartment());
                }

            }
        };
    }



    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
