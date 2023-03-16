package baiTap.bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculatorController {
    @GetMapping("/directCalculator")
    public String direct() {
        return "index1";
    }
    @GetMapping("/calculate")
    public String calculate(@RequestParam("numb1") double numb1,
                            @RequestParam("numb2") double numb2,
                            @RequestParam("operator") String operator,
                            Model model
                            ) {
        double rs = 0;
        switch (operator){
            case "+":
                rs = numb1 + numb2;
                break;
            case "-":
                rs = numb1 - numb2;
                break;
            case "*":
                rs = numb1 * numb2;
                break;
            case "/":
                rs = numb1 / numb2;
                break;
        }
        model.addAttribute("rs", rs);
        return "index1";
    }

}
