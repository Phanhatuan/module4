package exercise.controller;

import exercise.entity.Song;
import exercise.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;
    @GetMapping("")
    public String showList(ModelMap model){
        model.addAttribute("songs", songService.findAll());
        return "index";
    }
    @GetMapping("/create")
    public String showCreateForm(ModelMap model){
        Song song = new Song();
        model.addAttribute("song", song);
        return "create";
    }
    @PostMapping("/save")
    public String doCreate(@ModelAttribute(name = "song") Song song, Model model, RedirectAttributes rd){
        songService.create(song);
        rd.addFlashAttribute("message", "Thêm mới thành công");
        return "redirect:/song";
    }
    @GetMapping("/{id}/delete")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("song", songService.findById(id));
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(Song song){
        songService.delete(song);
        return "redirect:/song";
    }
}
