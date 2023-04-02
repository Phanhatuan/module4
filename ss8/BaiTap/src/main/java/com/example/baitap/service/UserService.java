package com.example.baitap.service;

import com.example.baitap.entity.User;
import com.example.baitap.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public void create(User user) {
        iUserRepository.save(user);
    }

    @Override
    public void delete(String id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public User findById(String id) {
        return iUserRepository.findById(id).orElse(null);
    }
}
