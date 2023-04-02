package exercise.service;

import exercise.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(int id);

    void create(Category category);

    void update(Category category);

    void delete(Category category);

}
