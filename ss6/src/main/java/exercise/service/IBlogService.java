package exercise.service;

import exercise.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void create(Blog blog);

    void update(Blog blog);

    void delete(Blog blog);
}
