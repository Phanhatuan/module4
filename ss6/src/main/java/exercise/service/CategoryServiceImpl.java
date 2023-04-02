package exercise.service;

import exercise.entity.Category;
import exercise.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements ICategoryService{
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return iCategoryRepository.findById(id);
    }

    @Override
    public void create(Category category) {
        iCategoryRepository.create(category);
    }

    @Override
    public void update(Category category) {
        iCategoryRepository.update(category);
    }

    @Override
    public void delete(Category category) {
        iCategoryRepository.delete(category);
    }

}
