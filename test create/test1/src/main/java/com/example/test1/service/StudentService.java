package com.example.test1.service;

import com.example.test1.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface StudentService {
    void create(Student student);
    void update(Student student);
    void delete(String id);
    List<Student> findAll();
    Student findById(String id);

    Page<Student> findAllWithPaging(Pageable pageable);
    public Slice<Student> findAllWithSlice(Pageable pageable);
}
