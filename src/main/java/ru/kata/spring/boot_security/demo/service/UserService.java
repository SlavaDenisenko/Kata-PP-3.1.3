package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User findByUsername(String username);
    User findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
}
