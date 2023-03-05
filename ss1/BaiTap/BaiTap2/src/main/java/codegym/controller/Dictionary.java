package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Dictionary {
    public static List<String> arr = new ArrayList<>();
    public static List<String> brr = new ArrayList<>();

    static {
        arr.add(0,"xin chao");
        arr.add(1,"tam biet");
        brr.add(0,"hello");
        brr.add(1,"bye");
    }
    @GetMapping("/direct")
    public String direct() {
        return "index";
    }
    @GetMapping("/translate")
    public String calculate(@RequestParam(value = "word") String word, Model model) {
        String word2 = null;
        for (int i = 0; i < arr.size(); i++) {
            if(brr.get(i).equals(word)){
                word2 = arr.get(i);
            }
        }
        model.addAttribute("word2", word2);
        return "index";
    }
    
}
