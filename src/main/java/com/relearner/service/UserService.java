package com.relearner.service;

import com.relearner.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    List<User> getAllUsers();

    User getById(Long id);
    List<User> getByRole(String role);
    void updateUser(Long id, String name, String email);
    void deleteUser(Long id);
}