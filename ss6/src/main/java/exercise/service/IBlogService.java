package exercise.service;

import exercise.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void create(Blog blog);

    void update(Blog blog);

    void delete(Blog blog);

}
