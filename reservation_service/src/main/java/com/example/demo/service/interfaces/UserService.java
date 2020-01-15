package com.example.demo.service.interfaces;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User save(User user);
    public void delete(User user);
    void update(User user);
    public Optional<User> findById(Long id);
    List<User> findAll();
}
