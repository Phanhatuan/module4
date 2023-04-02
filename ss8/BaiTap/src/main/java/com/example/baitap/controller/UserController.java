package com.example.baitap.controller;

import com.example.baitap.entity.User;
import com.example.baitap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    IUserService userService;
    @GetMapping("/user")
    public String showList(ModelMap modelMap){
        List<User> users = userService.findAll();
        modelMap.addAttribute("users", users);
        return "user/list";
    }
    @GetMapping("/create")
    public String showCreate(ModelMap modelMap){
        User user = new User();
        modelMap.addAttribute("user",user);
        return "user/create";
    }
    @PostMapping("/create")
    public String doCreate(@Valid  @ModelAttribute("user") User user,
                           BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()){
            return "user/create";
        }
        userService.create(user);
        return "redirect:/user";
    }
}
