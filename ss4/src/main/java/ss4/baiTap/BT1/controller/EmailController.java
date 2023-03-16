package ss4.baiTap.BT1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ss4.baiTap.BT1.model.Email;
import ss4.thucHanh.TH1.model.Employee;

@Controller
@RequestMapping("email/")
public class EmailController {
    String[] languages = {"English", "Vietnamese", "Japanese", "Chinese"};
    public int[] pages = new int[]{5, 10, 15, 25, 50, 100};

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        Email emailConfig = new Email();
        model.addAttribute("emailConfig", emailConfig);
        model.addAttribute("languages", languages);
        model.addAttribute("pages", pages);
        return "email/index";
    }
    @PostMapping("save")
    public String save(Model model, @ModelAttribute(name = "emailConfig") Email emailConfig){
        model.addAttribute("emailConfig",emailConfig);
        model.addAttribute("languages", languages);
        model.addAttribute("pages", pages);
        model.addAttribute("message","Settings have been saved");
        return "email/index";
    }
}
