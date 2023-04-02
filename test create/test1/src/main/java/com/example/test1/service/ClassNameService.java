package com.example.test1.service;

import com.example.test1.entity.ClassName;

import java.util.List;

public interface ClassNameService {
    void create(ClassName className);
    void update(ClassName className);
    void delete(String id);
    List<ClassName> findAll();
    ClassName findById(String id);
}
