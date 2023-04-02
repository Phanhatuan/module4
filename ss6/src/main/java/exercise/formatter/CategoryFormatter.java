package exercise.formatter;

import exercise.entity.Blog;
import exercise.entity.Category;
import exercise.service.IBlogService;
import exercise.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CategoryFormatter implements Formatter<Category> {
    private ICategoryService categoryService;

    public CategoryFormatter(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        int id = Integer.parseInt(text);
        return categoryService.findById(id);
    }


    @Override
    public String print(Category object, Locale locale) {
        return object.toString();
    }
}
