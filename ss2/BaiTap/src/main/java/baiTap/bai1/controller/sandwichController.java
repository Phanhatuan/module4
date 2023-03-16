package baiTap.bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class sandwichController {
    @GetMapping("/direct")
    public String direct() {
        return "index";
    }
    @GetMapping("/make")
    public String makeSandwich(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("condiment", condiment);
        return "index";
    }
}
