package com.example.baitap.service;

import com.example.baitap.entity.User;

import java.util.List;

public interface IUserService {
    void create(User user);
    void delete(String id);
    List<User> findAll();
    User findById(String id);
}
