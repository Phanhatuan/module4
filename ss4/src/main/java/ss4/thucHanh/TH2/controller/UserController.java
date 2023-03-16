package ss4.thucHanh.TH2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ss4.thucHanh.TH2.DAO.UserDAO;
import ss4.thucHanh.TH2.model.Login;
import ss4.thucHanh.TH2.model.User;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("login/home", "login", new Login());
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDAO.checkLogin(login);
        ModelAndView modelAndView;
        if(user == null){
            modelAndView = new ModelAndView("login/error");
        } else {
            modelAndView = new ModelAndView("login/user");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }
}
