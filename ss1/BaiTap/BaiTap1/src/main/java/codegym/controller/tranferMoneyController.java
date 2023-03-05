package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class tranferMoneyController {
    @GetMapping("/direct")
    public String direct() {
        return "index";
    }
    @GetMapping("/calculate")
    public String calculate(@RequestParam(value = "money") int money, Model model) {
        model.addAttribute("money", money*23000);
        return "index";
    }
}
