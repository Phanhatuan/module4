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

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService CategoryService;
    @GetMapping("")
    public String showList(ModelMap modelMap){
        modelMap.addAttribute("categories", CategoryService.findAll());
        return "category/list";
    }

    @GetMapping("create")
    public String showCreate (ModelMap modelMap){
        Category category = new Category();
        modelMap.addAttribute("category",category);
        return "category/create";
    }
    @PostMapping("create")
    public String doCreate (@ModelAttribute("category") Category category, ModelMap modelMap){
        CategoryService.create(category);
        return "redirect:/category";
    }
    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable int id, Model model) {
        model.addAttribute("category", CategoryService.findById(id));
        return "category/delete";
    }
    @PostMapping("/delete")
    public String delete(Category category){
        CategoryService.delete(category);
        return "redirect:/category";
    }
    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("category", CategoryService.findById(id));
        return "category/update";
    }
    @PostMapping("/update")
    public String doUpdate(Category category){
        CategoryService.update(category);
        return "redirect:/category";
    }
    @GetMapping("/{id}/detail")
    public String showDetail(@PathVariable int id, Model model) {
        model.addAttribute("category", CategoryService.findById(id));
        return "category/detail";
    }
}
