package exercise.controller;

import exercise.entity.Blog;
import exercise.entity.Category;
import exercise.service.IBlogService;
import exercise.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;
    @GetMapping("")
    public String showList(ModelMap modelMap){
        modelMap.addAttribute("blogs", blogService.findAll());
        return "blog/list";
    }

    @GetMapping("create")
    public String showCreate (ModelMap modelMap){
        List<Category> categories = categoryService.findAll();
        Blog blog = new Blog();
        blog.setCategory_id(new Category());
        modelMap.addAttribute("blog",blog);
        modelMap.addAttribute("categories",categories);
        return "blog/create";
    }
    @PostMapping("create")
    public String doCreate (@ModelAttribute("blog") Blog blog){
        blogService.create(blog);
        return "redirect:/blog";
    }
    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/delete";
    }
    @PostMapping("/delete")
    public String delete(Blog blog){
        blogService.delete(blog);
        return "redirect:/blog";
    }
    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, ModelMap modelMap) {
        modelMap.addAttribute("blog", blogService.findById(id));
        List<Category> categories = categoryService.findAll();
        modelMap.addAttribute("categories",categories);
        return "blog/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("blog") Blog blog){
        blogService.update(blog);
        return "redirect:/blog";
    }
    @GetMapping("/{id}/detail")
    public String showDetail(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/detail";
    }
}
