package baiTap.bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sandwichController {
    @GetMapping("/direct")
    public String direct() {
        return "index";
    }
}
