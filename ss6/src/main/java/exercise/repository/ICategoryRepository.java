package exercise.repository;

import exercise.entity.Blog;
import exercise.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ICategoryRepository {
    List<Category> findAll();

    Category findById(int id);

    void create(Category category);

    void update(Category category);

    void delete(Category category);
}
