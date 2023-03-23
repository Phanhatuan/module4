package exercise.controller;

import exercise.entity.Blog;
import exercise.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @GetMapping("")
    public String showList(ModelMap modelMap){
        modelMap.addAttribute("blogs", blogService.findAll());
        return "list";
    }

    @GetMapping("create")
    public String showCreate (ModelMap modelMap){
        Blog blog = new Blog();
        modelMap.addAttribute("blog",blog);
        return "create";
    }
    @PostMapping("create")
    public String doCreate (@ModelAttribute("blog") Blog blog, ModelMap modelMap){
        blogService.create(blog);
        return "redirect:/blog";
    }
    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(Blog blog){
        blogService.delete(blog);
        return "redirect:/blog";
    }
    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "update";
    }
    @PostMapping("/update")
    public String doUpdate(Blog blog){
        blogService.update(blog);
        return "redirect:/blog";
    }
    @GetMapping("/{id}/detail")
    public String showDetail(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "detail";
    }
}
