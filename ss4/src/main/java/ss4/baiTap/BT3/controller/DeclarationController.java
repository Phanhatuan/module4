package ss4.baiTap.BT3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ss4.baiTap.BT3.model.Declaration;
import ss4.baiTap.BT3.service.DeclarationServiceImpl;

@Controller
@RequestMapping(value = "declaration")
public class DeclarationController {
    @Autowired
    private DeclarationServiceImpl declarationService;
    String [] years = {"1990","1991","1992"};
    String [] genders = {"Male", "Female"};
    String [] nationalities = {"VietNam", "USA", "German"};
    String [] vehicles = {"Ship", "Train", "Plane", "Other"};
    String [] cities = {"Da Nang", "Ha Noi", "Ho Chi Minh", "Other"};
    String [] districts = {"Hai Chau", "Lien Chieu", "Ngu Hanh Son", "Other"};
    String [] wards = {"Thanh Binh", "Thach Gian", "Hoa Thuan", "Other"};
    @GetMapping(value = "/show")
    public String showForm(ModelMap model) {
        Declaration declaration = new Declaration();
        model.addAttribute("declaration", declaration);
        model.addAttribute("years", years);
        model.addAttribute("genders", genders);
        model.addAttribute("nationalities", nationalities);
        model.addAttribute("vehicles", vehicles);
        model.addAttribute("cities", cities);
        model.addAttribute("districts", districts);
        model.addAttribute("wards", wards);
        return "Declaration/index";
    }
    @PostMapping(value = "create")
    public String saveForm (@ModelAttribute(name = "declaration") Declaration declaration, ModelMap model){
        System.out.println(declaration.toString());
        declarationService.save(declaration);
        model.addAttribute("message", "Thêm thành công!");
        model.addAttribute("declaration",declaration);
        return "Declaration/info";
    }
}
